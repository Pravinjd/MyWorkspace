package Generate_Fibonacci_series;

public class Generate_Fibonacci_series {

	public static void main(String[] args) {
		//Fb series: 0 1    1 2 3 5 8 13 21 34
		int n1=0, n2=1, sum=0 ;
		
		System.out.println(n1+ " " +n2);
		
		for(int i=2; i<50; i++)   //3 ..4..5..6..7..8..9..10..fails
		{
			sum=n1+n2;  //0+1=1  1+1=2 1+2=3..... 
			
			System.out.print("  "  + sum); //1 2 3 
			n1=n2;                           // n1=1..2..3..5...
			n2=sum;							 // n2=1..2..3..5...
			
		}
	}

}
