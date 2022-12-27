package javaPrograms;

import java.util.Scanner;

public class JP73 {

	public static void main(String[] args) {
		// find the square root of the given number
		
		 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter any number:");
         
          int num = scanner.nextInt();
         
         System.out.println("Square root of the given number is: "+Math.sqrt(num));
         
          scanner.close();

	}

}

//Output:
//
//Enter any number:
//4
//Square root of the given number is: 2.0
