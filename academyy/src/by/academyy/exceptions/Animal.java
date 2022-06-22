package by.academyy.exceptions;

public class Animal {
	public void eat() throws CustomException, IllegalAccessException{
		throw new CustomException("EatException");
		
	}

}
