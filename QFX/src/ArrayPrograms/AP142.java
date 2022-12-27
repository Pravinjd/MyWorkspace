package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class AP142 {

	public static void main(String[] args) {
		// sort an ArrayList in Ascending and Descending order
		
		 ArrayList<Integer> alist = new ArrayList<Integer>();
         
         alist.add(9);
         alist.add(5);
         alist.add(1);
         alist.add(3);
        
        Collections.sort(alist);
        
        System.out.println(alist);
        
        Collections.sort(alist,Collections.reverseOrder());
        
        System.out.println(alist);

	}

}

//Output:
//
//[1, 3, 5, 9]
//[9, 5, 3, 1]
