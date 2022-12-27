package ArrayPrograms;

import java.util.Arrays;

public class AP90 {

	public static void main(String[] args) {
		//  swap first and last elements of the Arra
		
		  int[] a = {1,2,3,4,5};
          
          int temp ;
         
          int size = a.length ;
         
          temp = a[0];
         
          a[0] = a[size-1];
         
          a[size-1] = temp;
         
         System.out.println(Arrays.toString(a));
	}

}

//Output:
//
//[5, 2, 3, 4, 1]