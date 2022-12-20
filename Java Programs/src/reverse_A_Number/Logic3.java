package reverse_A_Number;

import java.util.Scanner;

public class Logic3 {

	public static void main(String[] args) {

		// taking input from user

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");

		int num = scanner.nextInt();
		
		// Using StringBuilder Class

		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("reverse no is " + rev);
		scanner.close();

	}

}
