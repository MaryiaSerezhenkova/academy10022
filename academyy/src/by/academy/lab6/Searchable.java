package by.academy.lab6;
@FunctionalInterface
public interface Searchable {

	boolean test(Plane plane);
	
	boolean equals(Object o);

	int hashCode();

	String toString();
}