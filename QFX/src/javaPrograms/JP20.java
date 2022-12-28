package javaPrograms;

public class JP20 {

	public static void main(String[] args) {
		// Find Sum of all digits in the given number
		
		 int number = 45321;
         
         int sum = 0;
        
         while(number != 0) 
         {
               
                sum = sum + number % 10;
               
                number = number / 10;
               
        }
        
        System.out.println("Sum of all digits in the given number is "+sum);
	}

}
