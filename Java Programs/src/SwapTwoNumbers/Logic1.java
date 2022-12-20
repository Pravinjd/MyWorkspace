package SwapTwoNumbers;

public class Logic1 {

	public static void main(String[] args) {
	
		int a=10, b=20;
		System.out.println("Before swapping values are :" + a + " " + b );
		
		//logic 1 - using Third Variable 
		
		int t=a;  // t=10
		a=b;      //a=20
		b=t;	  //b=10
			
		System.out.println("After  swapping values are :" + a + " " + b );


	}

}
