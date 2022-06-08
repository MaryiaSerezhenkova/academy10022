package by.academyy.payable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})

@Retention(RetentionPolicy.SOURCE)
public @interface Bank {
	String name();
	int age() default 5;

}
