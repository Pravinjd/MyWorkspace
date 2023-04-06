package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("X");
		a1.add("Y");
		a1.add("Z");
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		ArrayList a2 = new ArrayList();
		
		a2.addAll(a1);
		System.out.println(a2); //[X, Y, Z, A, B, C]
		
		//remove all
		a2.removeAll(a1);
		System.out.println(a2); //     []
		
		//sort--Collections.sort() 
		 Collections.sort(a1);
		 System.out.println( a1);  // [A, B, C, X, Y, Z]
		 
		 //reverse sort	 
		 Collections.sort(a1,Collections.reverseOrder());
		 System.out.println(a1);   // [Z, Y, X, C, B, A]
		 
		 //shuffle
		 Collections.shuffle(a1);
		 System.out.println(a1);   // [C, B, Z, Y, X, A]

	}

}
