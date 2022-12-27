package stringPrgrams;

import java.util.Scanner;

public class SP68 {
	public static void main(String[] args) {
		//convert the given String text to lower case
		
		
		 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter any String text:");
         
         String str = scanner.nextLine();
         
         System.out.println(str.toLowerCase());
         
         scanner.close();
	}
}

//Enter any String text:
//I LOVE JAVA Programming
//i love java programming
