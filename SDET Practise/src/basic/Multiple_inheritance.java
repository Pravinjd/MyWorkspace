package basic;

interface A
{
	int a=10;
	void display();
}

interface B
{
	int b=20;
	void show();
	
}




public class Multiple_inheritance implements A,B

{

	public void diplay()
	{
		System.out.println(a);
	}
	public void show()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		
		Multiple_inheritance mi=new Multiple_inheritance();
		mi.display();
		mi.show();

	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
