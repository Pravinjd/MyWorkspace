package javaPrograms;

public class JP16 {

	public static void main(String[] args) {
		//  find the sum of all even numbers from 1 to 10
		//2+4+6+8+10= 30
		
		int sum = 0;
		
		for (int i =1; i<=10; i++)
		{
			if(i%2==0)
			{
				sum=sum + i;
			}
			
		}
		System.out.println("sum of all even numbers from 1 to 10 is : " + sum);
		
		


	}

}
