package constructors;

public class Test {
	
	int a;
	boolean y;
	char p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Default Constructor");
		Test t1=new Test();
		t1.show();
		
		System.out.println("Parameterised Constructor char value");
		Test t3=new Test('u');
		t3.show();
		
		System.out.println("Parameterised Constructor boolean value");
		Test t4=new Test(true);
		t4.show();
		
		System.out.println("Parameterised Constructor int value"); 
		Test t2=new Test(45); 
		t2.show();
	}
	
	public void show()
	{
		System.out.println("Value of a :"+a);
		System.out.println("Value of y :"+y);
		System.out.println("Value of p :"+p);
	}
	
	public Test()
	{
		a=78;
		y=false;
		p='t';
	}

	public Test(int a)
	{
		this.a=a;  // This keyword is used here 
		p='S';
		y=false;
	}
	
	public Test(boolean x)
	{
		y=x;
	}
	
	public Test(char q)
	{
		p=q;
	}


	

	}


