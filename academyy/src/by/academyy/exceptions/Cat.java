package by.academyy.exceptions;

public class Cat extends Animal{
	@Override
	public void eat() throws CustomException, IllegalAccessException {
		throw new IllegalAccessException ();
		
	}

}
