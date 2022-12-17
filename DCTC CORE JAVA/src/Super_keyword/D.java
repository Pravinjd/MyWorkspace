package Super_keyword;

public class D  extends C{

	int w;
	
	//Calling parameterised Constructor of Parent Class
	public D()
	{
		super(78);
		w=67;
	}
	
	//Calling default Constructor of Parent Class
	public D(int z, int y)
	{
		//super(y);
		w=z;
	}
	
	
	//Calling Method of Parent Class
	public void show()
	{
		
		super.show();
		super.get();
		System.out.println("Value of w :"+w);
		System.out.println("Value of y :"+y);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1 = new D();
		d1.show();
		
		D d2=new D(25,45);
		d2.show();
	}


	
	

}
