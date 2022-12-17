package mydemo;

class Child extends Parent {


	static int i=10;
	


	Child ()
	{
		super(10);
		System.out.println("child constructor");

	}

//	{
//		System.out.println("inside non-static block" + "" + i);
//	}
//	static
//	{
//		System.out.println("inside static block" + i);
//	}
	
	void m1()
	{
		//super.m1();
		System.out.println("child m1");
		
	}


	public static void main(String[] args) 
	{

		Child obj =new Child();
		obj.m1();




	}

}
