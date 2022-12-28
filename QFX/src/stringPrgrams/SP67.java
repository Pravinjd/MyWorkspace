package stringPrgrams;

import java.util.Scanner;

public class SP67 {

	public static void main(String[] args) {
		// capitalize the first letter of each word in the given statement

		//		Scanner scanner = new Scanner(System.in);        
		//        System.out.println("Enter any statement:"); // hello java programming        
		//        String orgstr = scanner.nextLine();        
		//         scanner.close();
		
		String str = "hello java programming"  ;

		//Logic for capitalizing each and every word of the given statement

		String[] words = str.split(" "); 

		String finalstr = "";

		for(String word : words) 
		{       
			char[] a = word.toCharArray();  

			char c = a[0];

			String firstChar = String.valueOf(c).toUpperCase();

			String capitializedWord = firstChar; 

			for(int i=1; i<a.length; i++) 
			{     
				capitializedWord = capitializedWord + a[i];                      
			}

			finalstr = finalstr + capitializedWord +" "; 

		}

		System.out.println(finalstr);           

	}

}

//Enter any statement:
//hello java programming
//Hello Java Programming 
