package ArrayPrograms;

import java.util.Arrays;

public class AP51 {

	public static void main(String[] args) {
		// sorting the elements in the Array using build-in functions
		
		 int[] a = {8,1,5,9,12,33,23,7,4,3};
         
         System.out.println("Array Before sorting: "+Arrays.toString(a));
         
         Arrays.parallelSort(a);
         
         System.out.println("Array After sorting: " +Arrays.toString(a));
	}

}
//Output:

//Before sorting the array: [8, 1, 5, 9, 12, 33, 23, 7, 4, 3]
//After sorting the array : [1, 3, 4, 5, 7, 8, 9, 12, 23, 33]