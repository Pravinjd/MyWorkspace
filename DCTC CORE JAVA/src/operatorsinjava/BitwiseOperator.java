package operatorsinjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		
		//And operation
		int a=12,b=14;    // Local variables
		int c=a&b;
		System.out.println("AND operation  :"  +c);
		
		String x = Integer.toBinaryString(a);
		System.out.println(x); // this will print binary value of 12
		
		
		// OR operation
		c=a|b;  // if both inputs are 0 then o/p is 0 otherwise 1
		System.out.println("OR Operation: "  +c);
		
		
		//XOR operation
		c=a^b; //
		System.out.println("XOR operation  :"  +c);

	}

}
