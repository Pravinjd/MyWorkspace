package stringPrgrams;

public class SP79 {

	public static void main(String[] args) {
		// find reminder of two numbers without using modulus operator
		
	    int a = 10;
        int b = 3;
       
        int dividend = a/b;
       
        int reminder = a - (dividend *b);
       
        System.out.println("Remainder is: " +reminder);

	}

}
