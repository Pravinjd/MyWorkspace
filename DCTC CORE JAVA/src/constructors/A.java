package constructors;

public class A {
	
	 int n;

	public static void main(String[] args) {

		A a1=new A();
		a1.show();
		a1.n=65;
		
		A a2=new A();
		a1.show();
		
		A a3=new A();
		a3.show();
	}
	
	public A()
	{
		n=54;
		
	}
	
	public void show()
	{
		System.out.println("value of n "  +n);
	}

}
