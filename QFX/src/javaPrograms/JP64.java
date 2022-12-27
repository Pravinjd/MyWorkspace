package javaPrograms;

public class JP64 {

	public static void main(String[] args) {
		// display the numbers from 1 to 25 which are divisible by both 2 and 3

		for(int i=1;i<=25;i++) 
		{           
			if(i%2==0 && i%3==0) 
			{        
				System.out.print(i+ " ");                
			}
		}

	}

}
