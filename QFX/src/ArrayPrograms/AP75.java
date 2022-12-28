package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AP75 {

	public static void main(String[] args) {
		//  receive input from the User and saving into Array
		
		 Scanner scanner = new Scanner(System.in);
         
         System. out.println("Enter the size of the array:");
        
         int size = scanner.nextInt();
        
         int[] a = new int[size];
        
         for(int i=0;i<size;i++) {
            
            System.out.println("Enter number");
            
             a[i] = scanner.nextInt();
            
         }
        
         System.out.println("User's Array is : "+Arrays.toString(a)); 
        
         scanner.close();

	}

}

//Output:
//
//Enter the size of the array:
//5
//Enter number
//1
//Enter number
//2
//Enter number
//3
//Enter number
//4
//Enter number
//5
//User's Array is : [1, 2, 3, 4, 5]
