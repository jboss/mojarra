/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997-2013 Oracle and/or its affiliates. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 * 
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 * 
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.sun.faces.application.view;

import com.sun.faces.application.ApplicationAssociate;
import com.sun.faces.mgbean.BeanManager;
import com.sun.faces.util.LRUMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructViewMapEvent;
import javax.faces.event.PreDestroyViewMapEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.ViewMapListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * The manager that deals with non-CDI and CDI ViewScoped beans.
 */
public class ViewScopeManager implements HttpSessionListener, ViewMapListener {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ViewScopeManager.class.getName());
    /**
     * Stores the constants to keep track of the active view maps.
     */
    // FIXME - this constant is shared by jsf-api and JSF-ri it should not be spread all around the globe
    public static final String ACTIVE_VIEW_MAPS = "com.sun.faces.application.view.activeViewMaps";
    /**
     * Stores the constant for the maximum active view map size.
     */
    public static final String ACTIVE_VIEW_MAPS_SIZE = "com.sun.faces.application.view.activeViewMapsSize";
    /**
     * Stores the view map.
     */
    public static final String VIEW_MAP = "com.sun.faces.application.view.viewMap";
    /**
     * Stores the view map id.
     */
    public static final String VIEW_MAP_ID = "com.sun.faces.application.view.viewMapId";
    /**
     * Stores the constant to keep track of the ViewScopeManager.
     */
    public static final String VIEW_SCOPE_MANAGER = "com.sun.faces.application.view.viewScopeManager";

    /**
     * Constructor.
     */
    public ViewScopeManager() {
    }

    /**
     * Clear the current view map using the Faces context.
     *
     * @param facesContext the Faces context.
     */
    public void clear(FacesContext facesContext) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Clearing @ViewScoped beans from current view map");
        }

        destroyBeans(facesContext, facesContext.getViewRoot().getViewMap(false));
    }

    /**
     * Clear the given view map.
     *
     * @param facesContext the Faces context.
     * @param viewMap the view map.
     */
    public void clear(FacesContext facesContext, Map<String, Object> viewMap) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Clearing @ViewScoped beans from view map: {0}", viewMap);
        }

        destroyBeans(facesContext, viewMap);
    }

    /**
     * Destroy the managed beans from the given view map.
     * 
     * @param applicationAssociate the application associate.
     * @param viewMap the view map.
     */
    private void destroyBeans(ApplicationAssociate applicationAssociate, Map<String, Object> viewMap) {
        for (Map.Entry<String, Object> entry : viewMap.entrySet()) {
            String name = entry.getKey();
            Object bean = entry.getValue();

            try {
                if (applicationAssociate != null) {
                    BeanManager beanManager = applicationAssociate.getBeanManager();
                    if (beanManager != null && beanManager.isManaged(name)) {
                        beanManager.destroy(name, bean);
                    }
                }
            } catch (Exception exception) {
                if (LOGGER.isLoggable(Level.WARNING)) {
                    LOGGER.log(Level.WARNING, "Error calling @PreDestroy on bean with name: " + name, exception);
                }
            }
        }
    }
    
    /**
     * Destroy the managed beans from the given view map.
     *
     * @param facesContext the Faces Context.
     * @param viewMap the view map.
     */
    public void destroyBeans(FacesContext facesContext, Map<String, Object> viewMap) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Destroying @ViewScoped beans from view map: {0}", viewMap);
        }
        ApplicationAssociate applicationAssociate = ApplicationAssociate.getInstance(facesContext.getExternalContext());
        if (applicationAssociate != null) {
            destroyBeans(applicationAssociate, viewMap);
        }
    }

    /**
     * Get our instance.
     *
     * @param facesContext the FacesContext.
     */
    public static ViewScopeManager getInstance(FacesContext facesContext) {
        if (!facesContext.getExternalContext().getApplicationMap().containsKey(VIEW_SCOPE_MANAGER)) {
            facesContext.getExternalContext().getApplicationMap().put(VIEW_SCOPE_MANAGER, new ViewScopeManager());
        }
        return (ViewScopeManager) facesContext.getExternalContext().getApplicationMap().get(VIEW_SCOPE_MANAGER);
    }

    /**
     * Is a listener for the given source.
     *
     * @param source the source.
     * @return true if UIViewRoot, false otherwise.
     */
    @Override
    public boolean isListenerForSource(Object source) {
        return (source instanceof UIViewRoot);
    }

    /**
     * Process the system event.
     *
     * @param se the system event.
     * @throws AbortProcessingException when processing needs to be aborter.
     */
    @Override
    public void processEvent(SystemEvent se) throws AbortProcessingException {
        if (se instanceof PreDestroyViewMapEvent) {
            processPreDestroyViewMap(se);
        }

        if (se instanceof PostConstructViewMapEvent) {
            processPostConstructViewMap(se);
        }
    }

    /**
     * This global object represents a lock to be used when registering a fresh new map to a user http session.
     *
     * <P>
     * NOTE: This is indeed a global cross-cuting lock. That means it is not as efficient a synchronization mechanism as
     * a session level lock. Regardless, the lock is absolutely safe to use within the context of
     * processPostConstructViewMap and, since it shall applied in a tiny fraction code working with in-memory objects,
     * the performance impact of the global lock is nothing other than negligible. Use this lock with confidence in the
     * processPostConstructViewMap as opposed as programatic-faith that things will just workout without any sort of
     * syncrhonization when the session map is geting updated with an ActiveViewMaps object.
     */
    private static final Object GLOBAL_LOCK_TO_SYNCH_REGITRATION_OF_VIEW_MAP_ON_HTTP_SESSION = new Object();
    /**
     * Process the PostConstructViewMap system event.
     *
     * @param se the system event.
     */
    private void processPostConstructViewMap(SystemEvent se) {
        UIViewRoot viewRoot = (UIViewRoot) se.getSource();
        Map<String, Object> viewMap = viewRoot.getViewMap(false);

        if (viewMap != null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            Object session = facesContext.getExternalContext().getSession(true);
            if (session != null) {
                // (1) Determine the size of the Active view Maps
                Map<String, Object> sessionMap = facesContext.getExternalContext().getSessionMap();
                Integer size = (Integer) sessionMap.get(ACTIVE_VIEW_MAPS_SIZE);
                if (size == null) {
                    size = 25;
                }

                // (2) ensure that an LRU Map of Active Views exists on the user session 
                synchronized (GLOBAL_LOCK_TO_SYNCH_REGITRATION_OF_VIEW_MAP_ON_HTTP_SESSION) {
                    if (sessionMap.get(ACTIVE_VIEW_MAPS) == null) {
                        sessionMap.put(ACTIVE_VIEW_MAPS, (Map<String, Object>) new LRUMap<String, Object>(size));
                    }
                }

                // (3) register a new viewMapId into the activeViewMaps
                Map<String, Object> viewMaps = (Map<String, Object>) sessionMap.get(ACTIVE_VIEW_MAPS);
                synchronized (viewMaps) {
                    // 3.1 prorduce a new unique view map id
                    String viewMapId = UUID.randomUUID().toString();
                    while (viewMaps.containsKey(viewMapId)) {
                        viewMapId = UUID.randomUUID().toString();
                    }

                    // 3.2 Though LRU map implementation already ensures that the MAP does not go over capity
                    // however managing the removal of the eldest entry is still needed to cleanup after the beans
                    if (viewMaps.size() == size) {
                        String eldestViewMapId = viewMaps.keySet().iterator().next();
                        Map<String, Object> eldestViewMap = (Map<String, Object>) viewMaps.remove(eldestViewMapId);
                        removeEldestViewMap(facesContext, eldestViewMap);
                    }

                    // 3.3 Register the view map into the session scoped LRU- active view maps
                    viewMaps.put(viewMapId, viewMap);
                    viewRoot.getTransientStateHelper().putTransient(VIEW_MAP_ID, viewMapId);
                    viewRoot.getTransientStateHelper().putTransient(VIEW_MAP, viewMap);
                }
            }
        }
    }

    /**
     * Process the PreDestroyViewMap system event.
     *
     * @param se the system event.
     */
    private void processPreDestroyViewMap(SystemEvent se) {
        UIViewRoot viewRoot = (UIViewRoot) se.getSource();
        Map<String, Object> viewMap = viewRoot.getViewMap(false);

        if (viewMap != null && !viewMap.isEmpty()) {
            FacesContext facesContext = FacesContext.getCurrentInstance();

            destroyBeans(facesContext, viewMap);
        }
    }

    /**
     * Create the associated data in the session (if any).
     * 
     * @param se the HTTP session event.
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Creating session for @ViewScoped beans");
        }
    }
    
    /**
     * Destroy the associated data in the session.
     *
     * @param hse the HTTP session event.
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Cleaning up session for @ViewScoped beans");
        }
        
        HttpSession session = hse.getSession();
        Map<String, Object> activeViewMaps = (Map<String, Object>) session.getAttribute(ACTIVE_VIEW_MAPS);
        if (activeViewMaps != null) {

            // cleanup the beans associated to the active views maps
            synchronized (activeViewMaps) {
                Iterator<Object> activeViewMapsIterator = activeViewMaps.values().iterator();
                ApplicationAssociate applicationAssociate = ApplicationAssociate.getInstance(hse.getSession().getServletContext());
                while (activeViewMapsIterator.hasNext()) {
                    // NOTE: This iterator should by default lead at most lead to 25 cycles as 
                    // the map is a 25 sized LRU map.
                    Map<String, Object> viewMap = (Map<String, Object>) activeViewMapsIterator.next();
                    destroyBeans(applicationAssociate, viewMap);
                }

                activeViewMaps.clear();
            }

            // cleanup the http session that is being destroyed of the compnents managed by the view scope manager
            session.removeAttribute(ACTIVE_VIEW_MAPS);
            session.removeAttribute(ACTIVE_VIEW_MAPS_SIZE);
        }
    }

    /**
     * Remove the eldest view map from the active view maps.
     *
     * @param eldestViewMap the eldest view map.
     */
    private void removeEldestViewMap(FacesContext facesContext, Map<String, Object> eldestViewMap) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Removing eldest view map: {0}", eldestViewMap);
        }

        destroyBeans(facesContext, eldestViewMap);
    }
}
