package day7;

 class Bike  
{
	final void run() // final method , so we canot override this method in child class
	{
		System.out.println("Runnig...........");
	}
}

class Honda extends Bike
{
	//void run()              //compile time error
	{
		System.out.println("Started................");
	}
}


public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
