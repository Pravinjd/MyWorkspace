package javaPrograms;

public class JP96 {

	public static void main(String[] args) {
		//print all the prime numbers between 1 and 100

		for(int i=2;i<100;i++) 
		{     
			boolean Prime = true;

			for(int j=2;j<i;j++) 
			{    
				if(i%j == 0) 
				{        
					Prime = false;                        
				}
			}

			if(Prime)
			{     
				System.out.print(i +" ");
			}

		}

	}

}
//
//Output:
//
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97