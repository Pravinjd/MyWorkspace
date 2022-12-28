package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class AP142 {

	public static void main(String[] args) {
		// sort an ArrayList in Ascending and Descending order
		
		 ArrayList<Integer> alist = new ArrayList<Integer>();
         
         alist.add(4);
         alist.add(1);
         alist.add(3);
         alist.add(2);
        
        Collections.sort(alist);
        
        System.out.println(alist);
        
        Collections.sort(alist,Collections.reverseOrder());
        
        System.out.println(alist);

	}

}

//Output:

//[1, 2, 3, 4]
//[4, 3, 2, 1]

