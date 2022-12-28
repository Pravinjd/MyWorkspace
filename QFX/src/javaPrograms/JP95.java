package javaPrograms;

public class JP95 {

	public static void main(String[] args) {
		//  program to check whether the given number is a prime number

		//		 Scanner scanner = new Scanner(System.in);
		//         
		//         System.out.println("Enter any number:");
		//         
		//          int number = scanner.nextInt();

		int num =19;

		boolean PrimeNumber = true;

		if(num > 1) 
		{      
			for(int i =2; i< num; i++) 
			{    
				if(num%i ==0) 
				{          
					PrimeNumber = false;
					break;      
				}  
			}
		}

		if(PrimeNumber) 
		{
			System.out.println(num +" is a prime number");
		} 
		else 
		{
			System.out.println(num +" is not a prime number");
		}

		//scanner.close();

	}

}

//Output:
//
//Enter any number:
//19
//19 is a prime number
