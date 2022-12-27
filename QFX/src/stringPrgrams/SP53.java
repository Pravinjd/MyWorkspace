package stringPrgrams;

public class SP53 {

	public static void main(String[] args) {
		// remove white spaces in the given string text
		
		String str = "java programing   with    selenium  " ;
        
        String str2 = str.replaceAll("\\s","");
        
        System.out.println(str2);

	}

}
