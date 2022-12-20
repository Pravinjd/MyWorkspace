package Palindrome_Number;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		//

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = s.nextInt();

		int org_num = num;

		int rev_num = 0;

		while (num != 0) {
			rev_num = rev_num * 10 + num % 10;  // rev=0*10 + 1234/10 =4 //40+3=43 //430+2=432 //4320+1=4321
			num = num / 10; 					// num=1234/10=123 //123/10=12 //12/10=1 //1/10=0
		}

		
		//System.out.println("reversed number:" + rev_num);

		if (org_num == rev_num) 
		{
			System.out.println( org_num+ " it is Palindrome number: " +rev_num );
		}
		else
		{
			System.out.println(org_num + " this no is not a palindrome number");
		}

	}

}
