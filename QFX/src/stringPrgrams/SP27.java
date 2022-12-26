package stringPrgrams;

import java.util.Scanner;

public class SP27 {

	public static void main(String[] args) {
		//   Palindrome String
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: "); //madam or mom dad

		String str = s.next();
		String orgstr = str;
		String revstr="";

		int len = str.length(); // it will

		for (int i=len-1; i >= 0; i--) // 
		{
			revstr = revstr + str.charAt(i); // p..a..v..a..n
		}
		
		//System.out.println("Revresed string:" +rev_str);
		
		if(orgstr.equals(revstr))   //or u can use:  ( orgstr==revstr )
		{
			System.out.println(orgstr + " :its palindrome String");
		}
		else
		{
			System.out.println(orgstr + "  :its not palindrome String");
		}
	}

}
