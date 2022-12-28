package javaPrograms;

public class JP139 {

	public static void main(String[] args) {
		//  check whether the given number is a perfect number

		//Perfect number is a number, which when add the sum of divisors except itself results in the same number. 
		//6 is a perfect number, as when you sum the divisors i.e. 1,2 and 3 expect itself i.e. 6 results in the same number 6. 

		//		  Scanner scanner = new Scanner(System. in);
		//          
		//          System. out.println( "Enter any number:");  //6
		//          
		//           int num = scanner.nextInt();
		//          
		//           scanner.close();
		
		int num=6;

		int sum = 0;

		for( int i=1; i< num; i++) 
		{
			if( num% i==0) 
			{
				sum = sum + i;
			}
		}

		if( num== sum) 
		{
			System. out.println( "Given number is a perfect number");

		} 
		else 
		{
			System. out.println( "Given number is not a perfect number");
		}

	}

}

//Output:
//
//Given number is a perfect number
