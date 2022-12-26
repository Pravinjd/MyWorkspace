package javaPrograms;

import java.util.Scanner;

public class JP15 {

	public static void main(String[] args) {
		//  intakes 6 numbers as input and prints their average
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter num1 : ");
		int num1= scanner.nextInt();
		
		System.out.println("Enter num2 : ");
		int num2= scanner.nextInt();
		
		System.out.println("Enter num3 : ");
		int num3= scanner.nextInt();
		
		System.out.println("Enter num4 : ");
		int num4= scanner.nextInt();
		
		System.out.println("Enter num5 : ");
		int num5= scanner.nextInt();
		
		System.out.println("Enter num6 : ");
		int num6= scanner.nextInt();
		
		scanner.close();
		
		//find avg
		
		System.out.println("avg of 6 num is :" + (num1+num2+num3+num4+num5+num6)/6);
		
		


	}

}
