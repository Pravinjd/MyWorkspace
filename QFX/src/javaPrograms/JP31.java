package javaPrograms;

public class JP31 {

	public static void main(String[] args) {
		//  given number is Armstrong number or not  153 371

		//If you cube every digit of the number and add them.
		//If this sum is equal to the actual number, then we can call the number as Armstrong number.

		//		 Scanner scanner = new Scanner(System.in);
		//         
		//         System.out.println("Enter any number:");// 153 371
		//         
		//          int originalNum = scanner.nextInt();

		//          int num = originalNum ;

		int originalNum = 153;  //153 371 are armstrong numbers
		int num = originalNum;

		int reminder;
		int cubedNum = 0;

		
		while( num>0 ) 
		{
			reminder = num % 10;

			num = num / 10;

			cubedNum = cubedNum + (reminder* reminder* reminder);
		}

		if(cubedNum ==originalNum) 
		{
			System.out.println("Given number is an Armstrong number");

		} else
		{
			System.out.println("Given number is not an Armstrong number");
		}

		// scanner.close();

	}

}


