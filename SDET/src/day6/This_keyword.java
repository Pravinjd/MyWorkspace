package day6;

public class This_keyword {

	int a,b;             // class or instance variables 
	
	/*
	void getvalues(int x ,int y )  // method variables or external variables
	{
		a=x;
		b=y;
	}
	*/
	
	
	// but suppose instead creating different variables you are using same variables
	// to save memory of program you  are using same variables
	//if you use x,y it will occupy some memory  
	
	// you can use this keyword while creating constructor also
	
	void getvalues(int a ,int b )  
	{
		this.a=a;        // here this.a represent variable which belongs to class variable 
		this.b=b;      // here this.b represent variable which belongs to class variable	
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		This_keyword tk= new This_keyword();
		
		tk.getvalues(20, 40);
		tk.printvalues();

	}

}
// 
