package javaPrograms;

import java.util.Scanner;

public class JP43 {

	public static void main(String[] args) {
		// reverse the given number
		
//		Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter any digit number:");  //1122
//        
//         int orgnum = scanner.nextInt();
		
		int orgnum=1122;
        
         int num = orgnum;
        
         int rem;
        
         int revnum = 0;
        
         while(num>0) {
               
        	 rem = num % 10;
               
        	 revnum = revnum * 10 + rem;
               
                num = num / 10;
               
        }
        
        System.out.println("Reversed number is: " +revnum);
        
         //scanner.close();

	}

}
