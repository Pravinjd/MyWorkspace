package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class AP141 {

	public static void main(String[] args) {
		// sort an Array in descending order using built-in functions
		
		//Note: Integer array need to be created for Collections.reverseOrder() to work.
		
		
		Integer[] a = {9,3,1,2,6,5,4,8,7};
        
        Arrays.sort(a,Collections.reverseOrder());
        
        System.out.println(Arrays.toString(a));

	}

}
//Output:
//
//[9, 8, 7, 6, 5, 4, 3, 2, 1]