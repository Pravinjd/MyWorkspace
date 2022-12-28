package Reverse_A_String;

public class Logic3 {

	public static void main(String[] args) {
		
		// 3.using StrinBuffer class
		
		String str= "navap";
		
		StringBuffer sb= new StringBuffer(str); //pass str as parameter
		
		System.out.println("Revresed string:" +sb.reverse());

	}

}
