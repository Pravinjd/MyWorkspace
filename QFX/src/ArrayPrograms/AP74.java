package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AP74 {

	public static void main(String[] args) {
		//  reverse an Array using Java Collections
		

        Integer[] a = {5,4,3,2,1};
        
        List<Integer> list = Arrays.asList(a);
        
        Collections.reverse(list);
        
        System.out.println(list);
	}

}

//Output: [1, 2, 3, 4, 5]