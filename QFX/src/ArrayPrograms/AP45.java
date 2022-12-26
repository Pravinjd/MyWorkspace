package ArrayPrograms;

import java.util.Arrays;

public class AP45 {

	public static void main(String[] args) {
		// compare two arrays  (Arrays are equal or not ) (inbuilt method) 

		int[] a = {0,1,2,3,4,5};
		int[] b = {0,1,2,3,4,5};

		if(Arrays.equals(a,b)) {   //method of an array Arrays.equals

			System.out.println("Given arrays are equal");

		} else {

			System.out.println("Given arrays are not equal");

		} 

	}

}
