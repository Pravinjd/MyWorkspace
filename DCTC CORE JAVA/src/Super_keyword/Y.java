package Super_keyword;

public class Y extends X {
	
	int q;
	public Y()
	{
		//super(55); // super key cha use krun parent madlya parametrised la call dila nahitr error yeto
		q=23;
		
		System.out.println(p);
		System.out.println(q);
	}
	
	public void show()
	{
		super.show(); 
		//System.out.println("inside  child Y");
		
	}

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Y y1 =new Y();
			y1.show();
			y1.put();
			
			
			X x=new Y();
			x.put();
			
	}

}
