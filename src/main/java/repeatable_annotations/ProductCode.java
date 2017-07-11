package repeatable_annotations;/**
 * Created by Evegeny on 11/07/2017.
 */

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Repeatable(ProductCodes.class)
public @interface ProductCode {
    int value();
}
