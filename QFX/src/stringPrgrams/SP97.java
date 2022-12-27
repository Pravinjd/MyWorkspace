package stringPrgrams;

import java.util.Scanner;

public class SP97 {

	public static void main(String[] args) {
		// count number of words in a String
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any Statement");
        
        String statement = scanner.nextLine();
        
        String[] str = statement.split(" ");
        
        System.out.println("The number of words in the given statement is: "+str.length);
        
         scanner.close();
	}

}
//
//Output:
//
//Enter any Statement
//This is a first statement.
//The number of words in the given statement is: 5