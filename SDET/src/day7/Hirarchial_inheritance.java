package day7;

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class child2 extends Parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}




public class Hirarchial_inheritance {

	public static void main(String[] args) {
		
		child1 c1=new child1();
		c1.a=100;
		c1.x=200;
		c1.display();
		c1.show();
		
		
		child2 c2=new child2();
		c2.a=1000;
		c2.y=2000;
		c2.display();
		c2.print();
		

	}

}
