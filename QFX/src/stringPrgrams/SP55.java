package stringPrgrams;

public class SP55 {

	public static void main(String[] args) {
		// reverse each word in the given String
		
		  String str = "Pravin Sambhaji Jadhav";
          
          String[] words = str.split(" ");
          
          String reversedStr = "";
          
           for(String word : words) {
                 
                 String reversedWord="";
                 
                  for(int i=word.length()-1; i>=0; i--) {
                       
                        reversedWord = reversedWord + word.charAt(i);
                       
                 }
                 
                  reversedStr = reversedStr +reversedWord +" ";
                 
          }
          
          System.out.println(reversedStr);

	}

}
