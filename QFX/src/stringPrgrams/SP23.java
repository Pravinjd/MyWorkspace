package stringPrgrams;

import java.util.HashMap;
import java.util.Map;

public class SP23 {

	public static void main(String[] args) {
		// print the duplicate characters with its number of times from String
		
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Enter any English statement:");
		//		String str = scanner.nextLine();

		String str = "learn java with selenium";

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		char[] arr = str.toCharArray();

		for (Character c : arr) 
		{
			if (m.containsKey(c)) 
			{
				m.put( c, m.get(c) + 1);
			} 
			else
			{
				m.put(c, 1);
			}
		}

		for (Character c : m.keySet()) 
		{
			if (m.get(c) > 1)
			{
				System.out.println("Character " + c + " is repeated: " + m.get(c) + " times");
			}
		}
		//scanner.close();
	
	}

}
