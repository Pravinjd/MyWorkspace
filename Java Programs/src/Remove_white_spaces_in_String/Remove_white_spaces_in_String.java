package Remove_white_spaces_in_String;

public class Remove_white_spaces_in_String {

	public static void main(String[] args) {
		
		String str= "java programing   with    selenium   ";
		
		str=str.replaceAll("\\s", "");
		
		System.out.println(str);

	}

}
