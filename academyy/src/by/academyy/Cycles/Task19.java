package by.academyy.Cycles;
////Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
//которое делится на их произведение. Найти эти числа.

public class Task19 {
	 public static void main(String[] args) {
	        
	        for (int x=10; x<100; x++) {
	            for (int y=10; y<100; y++) {
	            int N = x*100 + y;
	            int p = x*y;
	            if (N % p ==0)
	                System.out.println(N);
	            
	        }
	        
	    }
	 
	    }
	

}
