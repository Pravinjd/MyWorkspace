package constructors;

public class ThisInMethod {
	int emp_id;
	String emp_city;
	

	public static void main(String[] args) {
		
		ThisInMethod t= new ThisInMethod();
		//t.get();
		System.out.println("emp city  : "+ t.emp_city);
		System.out.println("emp city  : "+ t.emp_id);

	}
	
	public ThisInMethod()
	{
		show(this);
	}
	
	public void get()
	{
		show(this);
	}
	
	public void show (ThisInMethod u)
	{
		u.emp_id=6789;
		u.emp_city="pune";
	}

}
