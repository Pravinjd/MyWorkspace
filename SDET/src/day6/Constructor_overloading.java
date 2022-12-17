package day6;

public class Constructor_overloading {

	Constructor_overloading(int a, int b)     // 1st constructor
	{
		System.out.println(a+b);

	}

	Constructor_overloading(int a, double b)       // 2nd constructor
	{
		System.out.println(a+b);

	}

	Constructor_overloading(double a, int b)          // 3rd constructor
	{
		System.out.println(a+b);

	}

	Constructor_overloading(int a, int b,int c)      // 4th constructor
	{
		System.out.println(a+b+c);

	}





	public static void main(String[] args) {

		// to call 1st constructor
		Constructor_overloading co=new Constructor_overloading(10,20); 
		//here we have created object
		// but we have to pass values eg.(10,20) in bracket then this constructor will be invoked 

		// to call 2nd constructor
		Constructor_overloading co1=new Constructor_overloading(10,20.5); 

		// to call 3rd constructor
		Constructor_overloading co2=new Constructor_overloading(55.5,20); 

		// to call 4th constructor
		Constructor_overloading co3=new Constructor_overloading(10,20,30); 



	}

}
