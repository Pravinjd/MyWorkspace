package javaPrograms;

import java.util.Scanner;

public class JP40 {

	public static void main(String[] args) {
		// find the largest of given three numbers  //10 20 30
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        
         int a = scanner.nextInt();
        
        System.out.println("Enter second number:" );
        
         int b = scanner.nextInt();
        
        System.out.println("Enter third number:");
        
         int c = scanner.nextInt();
        
         if(a>b && a>c) {
               
               System.out.println(a+" is the largest number");
               
        } else if (b>c) {
               
               System.out.println(b+" is the largest number");
               
        } else {
               
               System.out.println(c+" is the largest number");
        }
        
         scanner.close();

	}

}
