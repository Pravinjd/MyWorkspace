package javaPrograms;

import java.util.Scanner;

public class JP005 {

	public static void main(String[] args) {
		//check whether the given input number is even or odd

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number:");
		
		int a = scanner.nextInt();

		if(a % 2 ==0) 
		{
			System.out.println(  a + " is an even number");
		} 
		else 
		{
			System.out.println(  a + " is an odd number");
		}

		scanner.close();


	}

}


