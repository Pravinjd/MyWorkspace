package constructors;

public class Test2 {
	
	int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
			
		Test2 t1=new Test2(89);
		
		Test2 t2=new Test2(105);	
	
	}

	public Test2()
	{
		n=90;
		this.get();   // This keyword is used to call current class's get method i.e(used to invoke get method ) 
		this.show();
	}
	
	public Test2(int z)
	{
		System.out.println("Parameterised Constructor");
		n=z;
		this.show();
	}
	
	public void show()
	{
		System.out.println("Value of n: "+n);
	}
	
	public void get()
	{
		System.out.println("Inside Get Method");
	}


}
