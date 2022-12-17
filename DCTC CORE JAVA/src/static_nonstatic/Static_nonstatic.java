package static_nonstatic;

public class Static_nonstatic {
	
	int empid=3456;  // non static class variable or instance variable
	static int empsal=78000;  // static class variable

	public static void main(String[] args) {
		
		int empcontact=12334656;     // Local variable
		
		Static_nonstatic s=new Static_nonstatic(); // created an object 
		
		s.empid=7890;
		empsal=85000;
		System.out.println(s.empid);
		
		
		
		get();                      //calling static method
		s.put();                    //calling non-static method
	
	}
	
	public static void get()
	{
		int empdob=10111996;          // Local variable
		    empsal=85000;
		    System.out.println(empsal);
	}
	
	public void put()
	{
		empid=8700;
		empsal=45000;
		System.out.println(empid);
	}

}
