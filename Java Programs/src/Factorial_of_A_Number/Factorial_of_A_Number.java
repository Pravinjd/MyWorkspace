package Factorial_of_A_Number;

public class Factorial_of_A_Number {

	public static void main(String[] args) {
		// using for loop
		//ascending order
		// 5!=1*2*3*4*5=120
		
		int num=5;
		
		long factorial=1;
		
		for(int i=1; i<=num;i++ )
		{
			factorial=factorial * i ;  //1 2 6 24 120
		}
		System.out.println("Factorial of a number :" +factorial);
		
		

	}

}
