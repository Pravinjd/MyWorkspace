package Count_words_in_String;

import java.util.Scanner;

public class Count_words_in_String {

	public static void main(String[] args) {
		
		System.out.println("Enter String  ::");
		
		Scanner s =new Scanner (System.in);
		
		String str= s.nextLine(); //welcome to java
		
		//first extract characters from a string
		
		int count=1;
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(	(str.charAt(i)==' ')   && (str.charAt(i+1) !=' ' ) )
			{
				count++;
			}
		}
		System.out.println("no of words in a string :" + count);
	
		
	
		
		
		
	}

}
