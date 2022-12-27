package ArrayPrograms;

import java.util.Arrays;

public class AP88 {

	public static void main(String[] args) {
		// left rotate an Array by 1 element
		
		 int[] a = {1,2,3,4,5};
         
         int size = a.length;
 
         int first = a[0];
        
         for(int i=0;i<size-1;i++) {
               
                a[i] = a[i+1];
               
        }
        
         a[size-1] = first;
        
        System.out.println(Arrays.toString(a));

	}

}
//Output:
//
//[2, 3, 4, 5, 1]