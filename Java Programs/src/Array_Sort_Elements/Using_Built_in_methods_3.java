package Array_Sort_Elements;

import java.util.Arrays;
import java.util.Collections;

public class Using_Built_in_methods_3 {

	public static void main(String[] args) {
		
		//sort array elements in descending/reverse order
		//using  Arrays.sort(a)
		
		Integer [] a = {40,20,10,50,30};
		
		System.out.println("Array before sorting :" + Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Array After sorting :" + Arrays.toString(a));
 }
}