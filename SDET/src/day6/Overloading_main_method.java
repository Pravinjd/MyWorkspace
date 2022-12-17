package day6;

public class Overloading_main_method {


	public void main (int x)          // our main method 1
	{
		System.out.println(x);
	}

	public void main (int x,int y)   // our main method 2
	{
		System.out.println(x+y);
	}


	static 
	{
		System.out.println("in static block");
	}

	{
		System.out.println("inside non static block");
	}




		public static void main(String[] args) {            // java's default main method

			Overloading_main_method omm= new Overloading_main_method();

			omm.main(10);
			omm.main(10, 20);


		}

	}

	// conclusion:
	// we can overload main method 
	//by providing different parameters to different main methods 