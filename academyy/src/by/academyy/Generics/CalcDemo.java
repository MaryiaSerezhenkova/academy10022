package by.academyy.Generics;

public class CalcDemo {
	public static void main(String[] args) {
		
		System.out.println(Calc.divide(2, 3.5));
		Integer[] arr= {1,2,3};
		//Average<?> []avg = new Average<Integer>(arr)[10];
		Average<Integer>avg = new Average<Integer>(arr);
		
	}

}
