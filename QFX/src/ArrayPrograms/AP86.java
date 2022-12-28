package ArrayPrograms;

import java.util.Arrays;

public class AP86 {

	public static void main(String[] args) {
		// right rotate an Array by 1 element

		int[] a = {1,2,3,4,5};

		int size = a.length;

		int last = a[size-1];

		for(int i=size-1; i>0;  i--) 
		{

			a[i] = a[i-1];               
		}

		a[0] = last;

		System.out.println(Arrays.toString(a));


	}

}

//Output:
//
//[5, 1, 2, 3, 4]
