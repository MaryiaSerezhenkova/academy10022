package Shop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})

@Retention(RetentionPolicy.SOURCE)
public @interface Producer {
	int startYear();
	String country() default "Belarus";
	String founderFullName();

}
