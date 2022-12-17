package second_program;  //package is container of classes

public class Variables_in_java { // variable: the entity whose value changes during execution

	
	//class variable or instance variable ---It should be declared in class
	
	//non-static variable
	int f=89;
	
	//static variable
	static int d=54;
	
	public static void main(String[] args) {
	//Local variables-it should be declared in function
		
		byte x=34;
		short e=65;
		int n=90;
		long q=45;
		float u=56.85f;
		double i=89.25;
		char z='s';
		
		get();
		
		System.out.println(n);
		System.out.println(u);
	    System.out.println(i);
		
	}
	public static void get()
	{
		System.out.println(d);
		d=78;
		System.out.println(d);
		
	}
	

}
