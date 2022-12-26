package javaPrograms;

import java.util.Scanner;

public class JP37 {

	public static void main(String[] args) {
		//  count the number of digits in the given number
		
		 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter any digit number:");
         
          int number = scanner.nextInt();
         
          int digitCount = 0;
         
          while(number>0) {
                
                 number = number / 10;
                
                 digitCount++;        
                
         }
         
         System.out.println("The number of digits in the number is: "+digitCount);
         
          scanner.close();

	}

}
