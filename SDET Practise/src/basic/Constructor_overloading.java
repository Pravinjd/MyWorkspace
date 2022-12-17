package basic;

public class Constructor_overloading {

	int a=0;
	int b=0;
	double c=0;
	
	Constructor_overloading()   // constructor 1
	{
		a=10;
		b=20;
		c=20.5;
	}
	
	Constructor_overloading(int x,int y)    // constructor 2
	{
		a=x;
		b=y;	
	}
	Constructor_overloading(int x,double y)             // constructor 3
	{
		a=x;
		c=y;	
	}
	Constructor_overloading (int x,int y,double z)               // constructor 4
	{
		a=x;
		b=y;
		c=z;
	}
	Constructor_overloading (int x,double y,int z)                    // fifth
	{
		a=x;
		b=z;      //since b is int data type we can not assign double value to him
		c=y;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor_overloading co1=new Constructor_overloading();// calling 1st constructor 
		co1.display();
		
		
		Constructor_overloading co2=new Constructor_overloading(10,20);//calling 2nd constructor
		co2.display();
		
		Constructor_overloading co3=new Constructor_overloading(10,20.5);//calling 3rd constructor
		co3.display();
		
		Constructor_overloading co4=new Constructor_overloading(10,20,20.5);//calling 4th constructor
        co4.display();
        
        Constructor_overloading co5=new Constructor_overloading(10,20.5,20);//calling 5th constructor
        co5.display();
	
	
	
	}
	
	
}
