package javaPrograms;

import java.util.Scanner;

public class JP93 {

	public static void main(String[] args) {
		//  program to perform calculator operation
		
		 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter first number");
         
          double fnumber = scanner.nextDouble();
         
         System.out.println("Enter any operator out of (+,-,*,/)");
         
          char operator = scanner.next().charAt(0);
         
         System.out.println("Enter second number");
         
          double snumber = scanner.nextDouble();
         
          double result = 0;
          boolean status = true;
         
          switch(operator) {
         
                 case '+':
                       result = fnumber+snumber;
                       break;
                 case '-':
                       result = fnumber-snumber;
                       break;
                 case '*':
                       result = fnumber* snumber;
                       break;
                 case '/':
                       result = fnumber/snumber;
                       break;
                 default:
                      System.out.println("Incorrect operator provided");
                       status= false;
         }
         
          if(status) {
                
                System.out.println(fnumber+"" +operator+""+snumber+"="+result);
                
         }
        
          scanner.close();

	}

}

//Output:
//
//Enter first number
//4
//Enter any operator out of (+,-,*,/)
//*
//Enter second number
//2
//4.0*2.0=8.0
