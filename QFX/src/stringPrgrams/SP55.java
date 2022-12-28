package stringPrgrams;

public class SP55 {

	public static void main(String[] args) {
		// reverse each word in the given String

		String str = "nivarP ijahbmaS vahdaJ ";

		String[] words = str.split(" ");

		String revStr = "";

		for(String word : words) 
		{                 
			String revWord="";

			for(int i=word.length()-1; i>=0; i--) 
			{                       
				revWord = revWord + word.charAt(i);
			}

			revStr = revStr +revWord +" ";
		}

		System.out.println(revStr);

	}

}
