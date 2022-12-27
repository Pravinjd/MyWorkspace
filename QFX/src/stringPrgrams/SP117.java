package stringPrgrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SP117 {

	public static void main(String[] args) {
		//  check whether the given Strings are anagrams using Collections

		//		The given String is an Anagram of another String, if both Strings have same length and characters, despite of having different order.
		//		'cat' and 'actt' are not anagrams
		//		'caat' and 'actt' are not anagrams
		//		'BAT' and 'TAB' are anagrams
		//		'Bat' and 'Tab' are anagrams
		//		Few thing to understand Anagrams in a better way:
		//		Number of characters in both words, after removing spaces should be same
		//		The count of different characters present in first word, should match with the count of them in the second word
		//		No need to be case sensitive
		
		 Scanner scanner =  new Scanner(System.in);
         
         System.out.println("Enter first String:");
        
         String str1 = scanner.nextLine();
        
         System.out.println("Enter second String:");
        
         String str2 = scanner.nextLine();
        
         str1 = str1.replaceAll( "\\s","").toLowerCase();
        
         str2 = str2.replaceAll( "\\s","").toLowerCase();
        
         if(isAnagram(str1,str2)) {
            
            System.out.println("Strings " +str1+" and "+str2 +" are Anagrams");
            
         } else {
            
            System.out.println("Strings "+str1 +" and "+str2 +" are not Anagrams");
         }
        
         scanner.close();
        
     }
     
      public static boolean isAnagram(String str1,String str2) {
            
            Map<Character,Integer> str1Map = new HashMap<Character,Integer>();
            Map<Character,Integer> str2Map = new HashMap<Character,Integer>();
            
            Character ch;
            
             for(int i=0;i<str1.length();i++) {
                   
                    ch = str1.charAt(i);
                   
                    if(str1Map.get(ch)==null) {
                         
                          str1Map.put(ch,1);
                         
                   } else {
                         
                          str1Map.put(ch,str1Map.get(ch)+1);
                         
                   }
                   
            }
            
             for(int i =0;i<str2.length();i++) {
                   
                    ch = str2.charAt(i);
                   
                    if(str2Map.get(ch)==null) {
                         
                          str2Map.put(ch,1);
                         
                   } else {
                         
                          str2Map.put(ch,str2Map.get( ch)+1);
                         
                   }
                   
            }
            
             return str1Map.equals(str2Map);
      }
}
//Output:
//
//Enter first String:
//Bat
//Enter second String:
//Tab
//Strings bat and tab are Anagrams
