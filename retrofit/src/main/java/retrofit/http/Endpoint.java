package retrofit.http;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Endpoint URL to use for the annotated method.
 * <p>
 * <pre>
 * &#64;GET
 * void fetch(@Endpoint String url, ..);
 * </pre>
 */
@Target(PARAMETER) @Retention(RUNTIME)
public @interface Endpoint { }