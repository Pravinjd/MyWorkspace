package SwapTwoNumbers;

public class Logic4 {
	
	public static void main(String[] args) {

		
		//using bitwise operator XOR(^)
		
		
		int a=10, b=20 ;
		
		 a= a^b;    // a=10^20=30
		 b= a^b;	// b=30^20=10
		 a= a^b;	// a=30^10=20
		 
		 System.out.println(a+"  "+b);
		 
		
	}
	

			

	 

}
