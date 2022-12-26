package stringPrgrams;

import java.util.Scanner;

public class SP25 {

	public static void main(String[] args) {
		// print the Fibonacci series till the inputted number
		
		
		//Example: 1 1 2 3 5 8 13 21 34 and if u enter 50 then 34+21=55 it will fail
		
		Scanner scanner= new Scanner (System.in);

		System.out.println("Enter any number : "); //50
		
		int num=scanner.nextInt();
		
		int a=1,b=1,fibnum=0;
		
		System.out.print(a +" " +b +" ");
		
		while(fibnum <= num)
		{
			fibnum=a+b;
			
			if(fibnum > num)
				break;
			
			System.out.print(fibnum+" ");
			
			a=b;
			
			b=fibnum;
		}
	}

}
