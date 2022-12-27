package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AP74 {

	public static void main(String[] args) {
		//  reverse an Array using Java Collections
		

        Integer[] a = {5,2,4,6,1,8};
        
        List<Integer> list = Arrays.asList(a);
        
        Collections.reverse(list);
        
        System.out.println(list);
	}

}

//Output:
//
//[8, 1, 6, 4, 2, 5]