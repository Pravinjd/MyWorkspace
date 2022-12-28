package javaPrograms;

public class JP37 {

	public static void main(String[] args) {
		//  count the number of digits in the given number

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter any digit number:");
//
//		int num = scanner.nextInt();
		
		int num=12345;

		int count = 0;

		while( num>0 ) 
		{      
			num = num / 10;

			count++;               
		}

		System.out.println("The number of digits in the given number : "+count);

		//scanner.close();

	}

}
