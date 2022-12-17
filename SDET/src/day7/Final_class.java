package day7;


final class Bike1 // final class,so we cannot extend into child class
{
	
	int speed=40;
	void run ()
	{
		System.out.println(speed);
	}
}

class Honda1 extends Bike1 // compile time error we cannot extend final class
{
	
}



public class Final_class {

	public static void main(String[] args) {
		

	}

}

