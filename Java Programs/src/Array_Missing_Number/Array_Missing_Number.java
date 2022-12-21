package Array_Missing_Number;

public class Array_Missing_Number {

	public static void main(String[] args) {
		
		// Array should not have duplicates
		// Array No need to be sorted order
		//values should be in range

		int a [] = {1,2,4,5};
		
		//find sum1 of the elements first 1+2+4+5=12
		//find sum2 of the range of elements 1+2+3+4+5=15
		//sum2-sum1= 15-12=3 which is missing number
		
		int sum1=0;
		
		for(int i=0; i<a.length; i++ )
		{
			sum1=sum1 + a[i];
		}
		System.out.println("sum of elements in array :" +sum1);
		
		int sum2=0;
		
		for(int i=1; i<=5; i++)
		{
			sum2=sum2 + i;
		}
		System.out.println("sum of range of elments in array :" +sum2);
		System.out.println("missing number is :"+ (sum2-sum1));
	}

}
