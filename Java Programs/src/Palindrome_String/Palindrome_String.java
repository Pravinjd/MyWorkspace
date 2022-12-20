package Palindrome_String;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str = s.next();
		String org_str = str;
		String rev_str="";

		int len = str.length(); // it will

		for (int i = len - 1; i >= 0; i--) // 
		{
			rev_str = rev_str + str.charAt(i); // p..a..v..a..n
		}
		
		//System.out.println("Revresed string:" +rev_str);
		
		if(org_str.equals(rev_str))   //or u can use:  ( org_str==rev_str )
		{
			System.out.println(org_str + " :its palindrome String");
		}
		else
		{
			System.out.println(org_str + "  :its not palindrome String");
		}
	}

}
