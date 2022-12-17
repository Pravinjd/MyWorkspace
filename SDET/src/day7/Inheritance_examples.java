package day7;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A         // B is child class & A is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B        // C is child class & B is Parent class
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}



public class Inheritance_examples {

	public static void main(String[] args) {
		
		A aobj=new A();
		
		aobj.a=100;
		aobj.display();
		
		B bobj=new B();
		
		bobj.b=200;
		bobj.print();
		
		bobj.a=10;            // i can now access variable a from class A
		bobj.display();       // i can now access method which belongs to class A. 
		
		C cobj=new C();
		
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();

	}

}
