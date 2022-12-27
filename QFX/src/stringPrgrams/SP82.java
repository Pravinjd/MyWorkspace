package stringPrgrams;

import java.util.Scanner;

public class SP82 {

	public static void main(String[] args) {
		// print the first half of the given string text
		

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any text");
        
        String str = scanner.nextLine();
        
         int halfsize = str.length()/2;
        
        System.out.println("First half of the given string is: "+str.substring(0,halfsize));
        
        scanner.close();

	}

}
//Output:
//
//Enter any sentence
//Flipkart
//First half of the given string is: Flip
