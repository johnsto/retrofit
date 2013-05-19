package retrofit.serializer;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Defines a serializer function to use when constructing the request.
 */
@Target(PARAMETER) @Retention(RUNTIME)
public @interface Serialize {
  Class<Serializer> value();
}

