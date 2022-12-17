package mydemo;

public class method_with_parameters {

	int a;
	int b;             // class or instance variables 
	int c;

	void get(int a,int b) // here we have not taken variable c to parameter 
	{
		this.a=10;
		this.b=20;
		this.c=30;
	}

	void printab()
	{
		System.out.println( "value of a : "  + a );
		System.out.println( "value of b : "  + b);
	}

	public static void main(String[] args) {
		method_with_parameters obj = new method_with_parameters();
		obj.get(100, 200);
		obj.printab();
	}
}
