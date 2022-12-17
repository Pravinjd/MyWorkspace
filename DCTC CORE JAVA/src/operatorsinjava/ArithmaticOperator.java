package operatorsinjava;

public class ArithmaticOperator {
	
	int a,b,c;

	public static void main(String[] args) {
		
		ArithmaticOperator a=new ArithmaticOperator();
		a.add();
		a.sub();
		a.mul();
		a.div();
		a.mod();

	}
	
	public void add()
	{
		a=45;
		b=75;
		c=a+b;
		System.out.println("Addition : " +c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction :" +c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println("Multiplication  =" +c);
	}
	public void div()
	{
		c=a/b;
		System.out.println("Division  =" +c);
	}
	public void mod()
	{
		c=a%b;
		System.out.println("Modulus  =" +c);
	}

}
