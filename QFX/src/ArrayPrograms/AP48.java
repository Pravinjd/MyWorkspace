package ArrayPrograms;

public class AP48 {

	public static void main(String[] args) {
		//  find the maximum and minimum in the given Array

		int[] a = {10,20,30,40,50,};

		int max = a[0];

		int min = a[0];

		for(int i=0;i <a.length ;i++) 
		{

			if( a[i] > max) 
			{

				max = a[i];

			}

			if( a[i] < min) 
			{

				min = a[i];

			}

		}

		System.out.println("Maximum number in the array is: " +max);

		System.out.println("Minimum number in the array is: " +min);

	}

}
