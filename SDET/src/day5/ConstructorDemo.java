package day5;

public class ConstructorDemo {

	int x;
	int y;
	
	ConstructorDemo() //default constructor
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a,int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo(); // invokes default constructor
		
		ConstructorDemo cd2=new ConstructorDemo(100,200); // invokes parameterized constructor
		
		cd.display();
		cd2.display();
	

	}

}
