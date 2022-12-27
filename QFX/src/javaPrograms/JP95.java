package javaPrograms;

import java.util.Scanner;

public class JP95 {

	public static void main(String[] args) {
		//  program to check whether the given number is a prime number
		
		 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter any number:");
         
          int number = scanner.nextInt();

          boolean isPrimeNumber = true;
         
          if(number > 1) {
                
                 for(int i = 2;i < number;i++) {
                      
                       if(number%i ==0) {
                             
                              isPrimeNumber = false;
                              break;
                             
                      }
                      
                }
                
                
         }
         
          if(isPrimeNumber) {
                
                System.out.println(number +" is a prime number");
                
         } else {
                
                System.out.println(number +" is not a prime number");
                
         }
         
          scanner.close();

	}

}

//Output:
//
//Enter any number:
//19
//19 is a prime number
