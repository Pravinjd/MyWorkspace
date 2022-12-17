package operatorsinjava;

public class Unaryoperator {

	public static void main(String[] args) {
		
		//increment operator
		int a =10;
		
		a++;
		System.out.println("value of a  :" +a);
		
		//decrement
		int b=9;
		
		b--;
		System.out.println("value of b :" +b);
		
		//compliment //value will increase by +1 and sign will change
		int x=~a;
		System.out.println("value of x :"  +x );
		
		//not operator
		
		boolean y=false;
		boolean z=!y;
		System.out.println("value of z :" +z);
		
		
		//increment and decrement in other way
		int m=5,n;
		n=m++;             //postfix   // here m is operand
		
		
	/*	
		n=m++;       //adhi n value dya m chi mag +/- kara
		n=m;   //n=5
		m=m+1; //m=5+1=6
		*/
		System.out.println("*****POSTFIX ADDITION****");
		System.out.println("value of n:" +n);
		System.out.println("value of m:" +m);
		
		n=++m;    //prefix   
		/*
		m=m+1;  //m=6+1=7   // adhi +/- kra mg n la m chi value dya 
		n=m;    //n=7
		*/
		System.out.println("*****PREFIX ADDITION****");
		System.out.println("value of n:" +n);
		System.out.println("value of m:" +m);
		
		n=m--;          
		/*
		 n=m;   //n=7
		 m=m-1; // m=m-1=6
		 */
		
		System.out.println("*****POSTFIX SUB****");
		System.out.println("value of n:" +n);
		System.out.println("value of m:" +m);
		
		n=--m;
		
		//m=m-1; //m=6-1=5
		//n=m;   //n=m=5
		System.out.println("*****PREFIX SUB****");
		System.out.println("value of n:" +n);
		System.out.println("value of m:" +m);

	}

}
