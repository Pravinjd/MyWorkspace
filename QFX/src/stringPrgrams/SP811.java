package stringPrgrams;

import java.util.Scanner;

public class SP811 {

	public static void main(String[] args) {
		//print the last three letters of the given text
		
		Scanner scanner = new Scanner(System.in);
        
        System. out.println("Enter any sentence");
        
        String str = scanner.nextLine();
        
         char[] carr = str.toCharArray();
        
         int size = carr.length;
        
        String threeLetters = "";
        
         for(int i=size-1;i>size-4;i--) {
               
                threeLetters = carr[i] + threeLetters;
        }
        
        System.out.println("Last three letters of the given text is: "+threeLetters);
        
         scanner.close();

	}

}

//Output:
//
//Enter any sentence
//Arun Motoori
//Last three letters of the given text is: ori
