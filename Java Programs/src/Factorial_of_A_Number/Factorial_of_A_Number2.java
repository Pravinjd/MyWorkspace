package Factorial_of_A_Number;

public class Factorial_of_A_Number2 {

	public static void main(String[] args) {
		// using for loop
		//descending order
		// 5!=5*4*3*2*1=120
		
		int num=5;
		
		long factorial=1;
		
		for(int i=num; i>=1; i-- )
		{
			factorial=factorial * i ;  //5 20 60 120 120
		}
		System.out.println("Factorial of a number :" +factorial);
		
		

	}

}
