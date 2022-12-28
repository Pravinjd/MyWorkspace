package ArrayPrograms;

public class AP41 {

	public static void main(String[] args) {
		// find the sum of all the elements in the Array

		int[] a = {3,2,5,8,6,9,7}; //3+2+5+8+6+9+7=40

		int sum = 0;

		for(int b : a) 
		{      
			sum = sum + b;              
		}

		System.out.println("Sum of all the elements in the array is: " +sum);

	}

}
