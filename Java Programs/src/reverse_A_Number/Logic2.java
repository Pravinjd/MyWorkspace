package reverse_A_Number;

import java.util.Scanner;

public class Logic2 {

	public static void main(String[] args) {

		// taking input from user

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");

		int num = scanner.nextInt();
		// Using StringBuffer Class

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("reverse no is " + rev);

	}

}
