package day6;

public class Method_overloading {

	void add(int a, int b)         //method 1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)          // method 2
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)         // method 3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)          // method 4
	{
		System.out.println(a+b);
	}
	
	
	

	
	public static void main(String[] args) {
		
		Method_overloading mo=new Method_overloading();
		
		mo.add(10, 20);               // this will call 1st method
		mo.add(10, 20.5);             // this will call 2nd method
		mo.add(10.5, 20.5);           // this will call 3rd method
		mo.add(10, 20, 30);            // this will call 4th method
		
		

	}

}
