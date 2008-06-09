package javax.faces.application;

import java.lang.annotation.Annotation;

/**
 * RELEASE_PENDING (edburns,rogerk) docs
 */
public interface AnnotationHolder {

    /**
     * RELEASE_PENDING (edburns,rogerk) docs
     * @param annotations
     */
    public void setAnnotations(Annotation[] annotations);


    /**
     * RELEASE_PENDING (edburns,rogerk) docs
     * @return
     */
    public Annotation[] getAnnotations();

}
