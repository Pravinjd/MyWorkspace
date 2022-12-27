package stringPrgrams;

import java.util.Scanner;

public class SP58 {

	public static void main(String[] args) {
		// find the ascii value of the given character
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any character:"); 
        
         char c = scanner.nextLine().charAt(0);
        
        System.out.println("ASCII value of the given character is: "+(int)c);
        
         scanner.close();
	}
}
//Output:

//Enter any Character:
//M
//ASCII value of the given character is: 77
