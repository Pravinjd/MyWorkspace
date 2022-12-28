package javaPrograms;

public class JP28 {

	public static void main(String[] args) {
		//  Palindrome number
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any number: ");  //121
//		
//		int num = scanner.nextInt();
		
		int num = 121;
		
		int orgnum = num;
		int revnum = 0;

		while (num != 0) 
		{
			revnum = revnum * 10 + num % 10;  // rev=0*10 + 1234/10 =4 //40+3=43 //430+2=432 //4320+1=4321
			num = num / 10; 					// num=1234/10=123 //123/10=12 //12/10=1 //1/10=0
		}

		
		//System.out.println("reversed number:" + rev_num);

		if (orgnum == revnum) 
		{
			System.out.println( orgnum + " it is Palindrome number: " + revnum);
		}
		else
		{
			System.out.println( orgnum + " it is NOT a Palindrome number: " + revnum );

		}
		
		//scanner.close();
	}

}
