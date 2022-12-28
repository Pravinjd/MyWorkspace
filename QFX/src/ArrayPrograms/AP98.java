package ArrayPrograms;

import java.util.Scanner;

public class AP98 {

	public static void main(String[] args) {
		//find the first occurance of the given element 
		//in the given array without using any algorithm

		int[] a = {1,3,5,5,5,6,6,9};

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number from array:"); 

		int num = scanner.nextInt();

		scanner.close();

		boolean isFound = false;

		for(int i=0;i<a.length;i++) 
		{
			if(num ==a[i]) 
			{
				System.out.println("The first occurance of given number "+a[i]+" in the array is available at index "+ i);
				isFound = true;
				break;
			}
		}

		if(!isFound) 
		{

			System.out.println("The given number is not avialble in the array");
		}
	}

}

//Output:
//Enter any number:
//5
//The first occurrence of given number 5 in the array is available at index 2
