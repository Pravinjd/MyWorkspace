package ArrayPrograms;

import java.util.Arrays;

public class AP76 {

	public static void main(String[] args) {
		// reverse the elements in the array
		
		  int[] a = {5,4,3,2,1};
          
          int temp ;
          int start = 0;
          int end = a.length -1;
         
          while(start < end) 
          {           
              temp = a[start];
             
              a[start] = a[end];
             
              a[end] = temp;
             
              start++;
              end--;           
          }
         
          System.out.println("Array after reversing its elements is: "+Arrays.toString(a));

	}

}

//Output:
//
//Array after reversing its elements is: [1, 2, 3, 4, 5]
