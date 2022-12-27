package stringPrgrams;

public class SP54 {

	public static void main(String[] args) {
		// number of occurances of a character in the given String text
		
		String str = "Arun Motoori";
        
        int before = str.length(); // total length before removing o 
       
        int after = str.replace("o","").length();//total length after removing 
        
        int finalcount=before -after ;
       
        System.out.println("Number of occurrences of o in the string is: "+finalcount);

	}

}
