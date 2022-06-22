package by.academyy.InnerClasses;
@FunctionalInterface
public interface Searchable {

	boolean test(Car car);
	
	boolean equals(Object o);

	int hashCode();

	String toString();
}