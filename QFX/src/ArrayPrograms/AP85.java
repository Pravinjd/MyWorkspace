package ArrayPrograms;

import java.util.ArrayList;

public class AP85 {

	public static void main(String[] args) {
		// find the number of elements in the ArrayList
		
		  ArrayList<Integer> alist = new ArrayList<Integer>();
		
		 alist.add(1);
         alist.add(2);
         alist.add(3);
         alist.add(4);
         alist.add(5);
         alist.add(6);
         
         System.out.println(alist);
        
        System.out.println("Number of the elements in the ArrayList is: "+alist.size());

	}

}
//Output:
//
//Number of the elements in the ArrayList is: 6