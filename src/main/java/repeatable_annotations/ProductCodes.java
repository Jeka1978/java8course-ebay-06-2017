package repeatable_annotations;/**
 * Created by Evegeny on 11/07/2017.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface ProductCodes {
    ProductCode[] value();
}
