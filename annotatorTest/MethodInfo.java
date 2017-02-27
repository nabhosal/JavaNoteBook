package annotatorTest;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Inherited
@Target(METHOD)
public @interface MethodInfo {
	String author() default "Nilesh";
	String date();
	int revision() default 1;
	String comments();
}
