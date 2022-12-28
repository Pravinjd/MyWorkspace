package ArrayPrograms;

import java.util.Arrays;

public class AP51 {

	public static void main(String[] args) {
		// sorting the elements in the Array using build-in functions
		
		 int[] a = {50,30,20,40,10};
         
         System.out.println("Array Before sorting: "+Arrays.toString(a));
         
         Arrays.parallelSort(a);
         
         System.out.println("Array After sorting : " +Arrays.toString(a));
	}

}
//Output:

//Array Before sorting: [50, 30, 20, 40, 10]
//Array After sorting : [10, 20, 30, 40, 50]
