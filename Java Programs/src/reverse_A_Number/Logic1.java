package reverse_A_Number;

import java.util.Scanner;

public class Logic1 {

	public static void main(String[] args) {
		
		//taking input from user
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int num=scanner.nextInt();
		
		//1.using algorithm
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;  //rev=0*10 + 1234/10 =4  //40+3=43   //430+2=432 //4320+1=4321
			num=num/10;			  //num=1234/10=123        //123/10=12 //12/10=1   //1/10=0
		}
		
		System.out.println("reverse no is " + rev);
		
		
		
		

	}

}
