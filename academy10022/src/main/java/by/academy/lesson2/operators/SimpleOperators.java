package by.academy.lesson2.operators;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = 5;
	    number = -number;
		
		System.out.println(number);
		
		boolean boo1 = true;
		boo1 = !boo1;
		System.out.println(boo1);
		
		char c = 'A';
		c = (char) (c+1);
		System.out.println(c);
		
		int a = 6%5;
		double b = 6.2%5.0;
		System.out.println(a);
		System.out.println(b);
		
		int number1 = 10;
		System.out.println(number1);
		number1+=10;
		System.out.println(number1);
		number1-=10;
		System.out.println(number1);
		number1*=10;
		System.out.println(number1);
		number1/=10;
		System.out.println(number1);
		number1%=10;
		System.out.println(number1);
		
		int i = 1;
		i++;
		System.out.println(i);
		i +=1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		
		int j = 0;
		--j;
		++j;
		j++;
		--j;
		
		System.out.println(j++); //0
		System.out.println(++j); //2
	}
}
