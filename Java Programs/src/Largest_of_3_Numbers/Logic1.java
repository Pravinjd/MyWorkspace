package Largest_of_3_Numbers;

import java.util.Scanner;

public class Logic1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter 1st number :" );
		int a=s.nextInt();
		
		System.out.println("Enter 2nd number :" );
		int b=s.nextInt();

		System.out.println("Enter 3rd number :" );
		int c=s.nextInt();
		
		//Logic 1:
		
		if(a>b && a>c)
		{
			System.out.println(a+ " is largest ");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+ " is largest ");
		}
		else 
		{
			System.out.println(c+ " is largest ");
		}
			
			


 }
}