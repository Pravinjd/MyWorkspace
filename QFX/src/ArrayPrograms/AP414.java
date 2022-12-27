package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class AP414 {

	public static void main(String[] args) {
		// sort an Array in descending order using built-in functions
		
		//Note: Integer array need to be created for Collections.reverseOrder() to work.
		
		
		Integer[] ar = {9,3,1,2,6,5,4,8,7};
        
        Arrays.sort(ar,Collections.reverseOrder());
        
        System.out.println(Arrays.toString(ar));

	}

}
//Output:
//
//[9, 8, 7, 6, 5, 4, 3, 2, 1]