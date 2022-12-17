package basic;

public class Static_examples {

	int a;       // non static variable
	static int b; // static variable
	
	
	static void m1()
	{
		System.out.println("This is m1 - static method");
	}
	
	void m2()
	{
		
		System.out.println("This is m2-non-static method");
	}
	
	void m3()       // non static method
	{
		a=500;      // non-static variable no issue here no error
		b=1000;     // static variables still no issue
		
		m1();       //it is static method still it accessible 
		m2();       //it is non-static method still it accessible 
	}
	
	
	public static void main(String[] args) {       // main  is static method
		
		b=100;  
		System.out.println(b);        //static methods can access static stuff only.          
		m1();
		
		// a=200;              // this is not accessible,bcz it is non static variable
		//m2();               // this is not accessible,bcz it is non static method

		
		Static_examples se=new Static_examples();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		
		
	}

}
