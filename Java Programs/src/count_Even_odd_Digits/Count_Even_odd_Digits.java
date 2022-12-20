package count_Even_odd_Digits;

public class Count_Even_odd_Digits {

	public static void main(String[] args) {
		
		int num=1234;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) //1234 123 12 1  0fails
		{
			//step1: extract last digit
			int rem=num%10;  //it will retuen last digit :: 4..3.. 2.. 1.. 
			
			if(rem%2==0)
			{
				even_count ++;  //if the digit is even,count will increase 1..2..3..
			}
			else
			{
				odd_count ++; //if the digit is odd, count will increase 1..2..3..
			}
			
			//step2:eleminate last digit from 1234 ie 123..12..1..fails
			num=num/10;
		}
		
		System.out.println("Count of even numbers: "+even_count);
		System.out.println("Count of odd numbers:  "+odd_count );
		
	}

}
