package javaPrograms;

public class JP20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
