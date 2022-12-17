package basic;

interface Testinter
{
	int a=10; // by default variable a is static and final 
	
	void display();  // it is abstract method: put semi colon
}



public class Interface_examples implements Testinter
{

	public void display()    // here we have add public keyword  or it will show error.
	{
	  System.out.println(a);
	}
	public static void main(String[] args) 
	
	{
		Interface_examples ie=new Interface_examples();
		ie.display();

	}

}
