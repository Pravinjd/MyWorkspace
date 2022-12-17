package constructors;

public class X {
	
int n=256;
	
	public X()
	{
		System.out.println("Inside X Constructor");
		Y m=new Y(this);
	}
	
	public void emp_details()
	{
		System.out.println("inside employee details method");
	}


}
