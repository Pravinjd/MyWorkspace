package Array_Sort_Elements;

import java.util.Arrays;

public class Using_Built_in_methods_2 {

	public static void main(String[] args) {
		
		//using  Arrays.sort(a)
		int [] a = {40,20,10,50,30};
		
		System.out.println("Array before sorting :" + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Array After sorting :" + Arrays.toString(a));
 }
}