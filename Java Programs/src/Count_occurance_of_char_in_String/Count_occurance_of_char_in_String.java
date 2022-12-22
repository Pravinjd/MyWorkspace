package Count_occurance_of_char_in_String;

public class Count_occurance_of_char_in_String {

	public static void main(String[] args) {
		
		String str= "java programming java oops";
		
		int ttlcount = str.length(); // total length before removing a 
		
		int count=str.replace("a", "").length(); //total length after removing a
		
		int finalcount=ttlcount -count ;
		
		System.out.println("no of occurances of a :" +finalcount);
	}

}
