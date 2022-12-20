package count_Sum_of_digits;

public class count_Sum_of_digits {

	public static void main(String[] args) {
		
		int num=1234;

		int sum=0;
		
		while(num>0)
		{
			 sum=sum + num%10 ;  //     0+4=4,   4+3=7, 7+2=9, 9+1=10
			 num=num/10;        //1234/10=123,      12,     1,   0>0 fail
		}
		
		System.out.println("sum of digits :" + sum);
	}

}
