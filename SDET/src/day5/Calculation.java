package day5;

//method is a block of code
//------------------------------
//case 1: not taking parameters and also not returned any value
//case 2: not taking parameters but returning value
//case 3: taking parameters but not returning any value
//case 4: taking parameters and also returning value 



public class Calculation {

	int x=10;
	int y=20;
	
	
	/*
	void sum() // case 1: not taking parameters and also not returned any value
	{
		System.out.println(x+y);
	}
	*/
	
	
	/*int sum() // case 2: not taking parameters and but returning value
	{
		return(x+y);
	}*/
	
	
	/*
	void sum(int a,int b) // case 3: taking parameters but not returnig any value
	{
		System.out.println(a+b);
	}
	*/
	
	int sum(int a,int b) // case 4: taking parameters and also returning value
	{
		return(a+b);
	}
	
	
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		
		// cal.sum();  //case 1 :
		
		
		//int result = cal.sum();       //case 2:
		//System.out.println(result);
		//System.out.println(cal.sum()); //we can also write this way
		
		
		//cal.sum(100,200);   // case 3 :
		
		
		System.out.println(cal.sum(200, 200));  //case 4

	}

}
