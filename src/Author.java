import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target specifies that this annotation can be applied to methods only
@Target(ElementType.METHOD)
// @Retention defines how long the annotation will be retained
// RetentionPolicy.RUNTIME means the annotation will be available at runtime through reflection
@Retention(RetentionPolicy.RUNTIME)
// Define a custom annotation named 'Author'
public @interface Author {
String name() default "";
}
