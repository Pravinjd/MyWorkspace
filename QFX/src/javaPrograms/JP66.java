package javaPrograms;

public class JP66 {

	public static void main(String[] args) {
		// find the factors of the number and the count number of factors

		//		  Scanner scanner = new Scanner(System.in);
		//          
		//          System.out.println("Enter the number:"); //8
		//          
		//           int number = scanner.nextInt();

		int num=8;

		int factorCount = 0;

		for(int i=1; i<=num; i++) 
		{      
			if(num % i == 0) 
			{                       
				System.out.print(i+" ");               

				factorCount++;      
			}

		}

		System.out.println("The given number has "+factorCount +" factors");

		// scanner.close();
	}
}
//Enter the number:
//8
//1 2 4 8 The given number has 4 factors
