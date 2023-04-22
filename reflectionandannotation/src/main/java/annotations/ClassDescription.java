package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClassDescription {
    String author();
    String date();
    int currentRevision() default 1;
    String[] reviewers();
}
