package methods;

public class Method_with_returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_with_returntype m= new Method_with_returntype();
		
		
		System.out.println("inside test_square method");
		int q=m.test_square(25);
		System.out.println(q);
		
		m.test_add();
		

	}
	
	public int test_square(int a)
	{
		return a*a;
		
	}
	
	public void test_add() 
	{
		System.out.println("inside test_add method");
		int q=test_square(25);
		System.out.println(q);
	}
	

}
