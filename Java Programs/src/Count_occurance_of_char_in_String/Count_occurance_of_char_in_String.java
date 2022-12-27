package Count_occurance_of_char_in_String;

public class Count_occurance_of_char_in_String {

	public static void main(String[] args) {
		
		String str= "java programming java oops";
		
		int before = str.length(); // total length before removing a 
		
		int after=str.replace("a", "").length(); //total length after removing a
		
		int finalcount=before - after ;
		
		System.out.println("no of occurances of a :" +finalcount);
	}

}
