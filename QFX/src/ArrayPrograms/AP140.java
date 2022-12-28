package ArrayPrograms;

import java.util.Arrays;

public class AP140 {

	public static void main(String[] args) {
		// sort an Array in Ascending order using built-in functions
		
//		Note: We can also use Arrays.parallelSort() in place of sort(). 
//		sort() is generally used in case of small sized arrays,
//		where as parallelSort() works well in terms of large sized arrays.
//		There is no difference, except the performance.
		
		  int a [] = {9,3,1,2,6,5,4,8,7,10};
          
          Arrays.sort(a);
          
          System.out.println(Arrays.toString(a));
	}

}

//Output:

//[1, 2, 3, 4, 5, 6, 7, 8, 9]
