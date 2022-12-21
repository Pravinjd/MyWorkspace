package Array_Searching_an_Element;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		
		// To perform binary search: array should be in sorted manner
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		//Using Arrays.binarySearch()
		//it will return an index where your element is located in that array
		//if not found then it will negative number 
		
		System.out.println(Arrays.binarySearch(a, 9));
		
		
	}

}
