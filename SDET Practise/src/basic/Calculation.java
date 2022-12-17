package basic;

public class Calculation {

	int a;
	int b;
	
	//1.method may not takes parameters--empty parameters
	/*void sum()
	{
		
		System.out.println(a+b);
	}*/
	//2.method takes parameters
	/*void sum (int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	
	}*/
	
	int sum()
	{
		return(a+b);
		
	}
	
	
	public static void main(String[] args) {
		
	Calculation cal=new Calculation();
	
	//1.method may not take parameters
	/*cal.a=100;
	cal.b=200;
	cal.sum();
	*/
	
	//2.method takes parameters:
	/*
	cal.sum(100, 200);
	*/
	
	//3.method return some value
	cal.a=100;
	cal.b=200;
	int r=cal.sum();
	System.out.print(r);
	}
	

}
