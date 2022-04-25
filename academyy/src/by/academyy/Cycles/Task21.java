package by.academyy.Cycles;
//Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+
//... + 1/(2n в квадрате) ( в квадрате только n)
//1,2,3,4,5...n
//2,4,6,8,10...2n


public class Task21 {
	public static void main(String[] args) {
        double sum = 0.0;
    int n = 5;
    for (int a = 2; a<=2*n; a=a+2)
        sum = sum+1/Math.pow(a,a);
    
    System.out.println(sum);
 
}
	

}
