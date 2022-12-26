package javaPrograms;

import java.util.Scanner;

public class JP43 {

	public static void main(String[] args) {
		// reverse the given number
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any digit number:");  //1122
        
         int orginalNumber = scanner.nextInt();
        
         int number = orginalNumber;
        
         int reminder;
        
         int reversedNumber = 0;
        
         while(number>0) {
               
                reminder = number % 10;
               
                reversedNumber = reversedNumber * 10 + reminder;
               
                number = number / 10;
               
        }
        
        System.out.println("Reversed number is: " +reversedNumber);
        
         scanner.close();

	}

}
