package ArrayPrograms;

public class AP42 {

	public static void main(String[] args) {
		//  seperately print the even and odd number in the given array

		int[] a = {1,2,3,4,5,6,7,8};

		System.out.println(" even numbers are below ");

		for(int b : a) 
		{               
			if(b % 2==0) 
			{                     
				System.out.print(b +" ");  //print not println    
			}

		}

		System.out.println();

		System.out.println("odd numbers are below");

		for(int b : a) 
		{
			if(b %2!=0) 
			{
				System.out.print(b +" ");     //print not println
			}

		}
	}

}
