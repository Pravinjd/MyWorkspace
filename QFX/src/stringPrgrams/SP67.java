package stringPrgrams;

import java.util.Scanner;

public class SP67 {

	public static void main(String[] args) {
		// capitalize the first letter of each word in the given statement
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any statement:"); // hello java programming
        
        String orgstr = scanner.nextLine();
        
         scanner.close();
        
         //Logic for capitalizing each and every word of the given statement
        
        String[] words = orgstr.split(" "); 
        
        String finalstr = "";
        
         for(String word : words) 
         {       
              char[] ca = word.toCharArray();  
               
              char c = ca[0];
               
              String firstChar = String.valueOf(c).toUpperCase();
               
               String capitializedWord = firstChar; 
               
                for(int i=1;i<ca.length;i++) {
                     
                      capitializedWord = capitializedWord + ca[i]; 
                     
               }
               
                finalstr = finalstr + capitializedWord +" "; 
               
        }
        
        System.out.println(finalstr);

	}

}

//Enter any statement:
//hello java programming
//Hello Java Programming 
