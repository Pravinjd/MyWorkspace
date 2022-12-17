package basic;

public class Method_overloading {
	
	int a;
	int b;
	
	void sum()                              //metod 1
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x,int y)                    // method 2
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	void sum(int x,int y,int z)              // method 3
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x,double y)                   // method 4
	{
		
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		Method_overloading mo=new Method_overloading ();
		
		mo.sum();  // calling 1st method
		
		mo.sum(100,200); // calling 2nd method
		
		mo.sum(10,20,30); //calling 3rd method
		mo.sum(10,10.5); // calling 4th method
		

	}

}
