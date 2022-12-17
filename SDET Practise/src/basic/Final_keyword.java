package basic;

class Test
{
	
	final int a=10;
	
	final void m1()
	{
		// a=20;   we cannot put this bcz " a is a final variable"
		System.out.println(a);
	}
}

class Test2 extends Test
{
	/* void m1()    //not valid bcz m1 is final method
	{
		
		System.out.println("m1 is over-ridden");
	}*/
	
}










public class Final_keyword {

	public static void main(String[] args) {
		

	}

}
