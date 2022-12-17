package day4;

public class String_methods {

	public static void main(String[] args) {
		
		String s="welcome";
		String s1="to java";
		
		
		System.out.println(s.length()); // length of a string
		
		System.out.println(s.concat(s1)); // joining of strings
		
		s="  welcome  ";
		System.out.println(s);
		System.out.println(s.trim()); // it will remove the spaces
		
		
		//charAt()
		s="welcome";
		System.out.println(s.charAt(3)); // returns characters based on index no.index will start from 0.
		
		//contains()
		
		s="welcome";
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("weL"));
		System.out.println(s.contains("welme"));
		
		//comparing strings
		//equals():
		
		s="welcome";
		
		System.out.println(s.equals("welcome")); // true
		System.out.println(s.equals("welcomE")); // false
		System.out.println(s.equals("wel come")); // false
		
		// equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase("welcomE"));//true
		
		//replacing characters:
		s="welcome to java";
		
		System.out.println(s.replace('o','i'));
		System.out.println(s.replace("java","selenium"));
		
	}

}
