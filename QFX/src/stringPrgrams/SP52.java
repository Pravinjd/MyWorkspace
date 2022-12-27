package stringPrgrams;

public class SP52 {

	public static void main(String[] args) {
		// remove special characters, spaces and other junk from the given String text
		
		 String str = "$131#@% $Pravin123 ABCDEF()";
         
         String str2 = str.replaceAll("[^a-zA-Z0-9]","");
         
         System.out.println(str2);

	}

}
