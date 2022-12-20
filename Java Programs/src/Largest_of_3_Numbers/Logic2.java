package Largest_of_3_Numbers;

import java.util.Scanner;

public class Logic2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter 1st number :" );
		int a=s.nextInt();
		
		System.out.println("Enter 2nd number :" );
		int b=s.nextInt();

		System.out.println("Enter 3rd number :" );
		int c=s.nextInt();
		
		//Logic 2// using ternary operator
		
		//1.largest of a & b
		int largest1 = a>b ? a:b; 
		
		//2.largest of above compare it with c
		 int largest2 = c>largest1 ? c:largest1; 
		 
		 //or shortcut
		//int largest2=c>(a>b ? a:b) ? c:( a>b ? a:b) ;
		 
		 System.out.println(largest2 + " is final largets number:");
		
	
			
			


 }
}