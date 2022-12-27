package stringPrgrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SP77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a statement one";
        
        String[] words = str.split(" ");
        
        List<String> list = Arrays.asList(words);
        
        Collections.reverse(list);
        
         for(String word : list) {
               
               System.out.print(word +" ");
	}

 }
}
//	Output:
//
//		one statement a is This