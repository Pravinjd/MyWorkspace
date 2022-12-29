package stringPrgrams;

import java.util.LinkedHashSet;
import java.util.Set;

public class SP100 {

	public static void main(String[] args) {
		//  remove the duplicate charaters in the given String
		
		 String str = "Ramoo Shoo Ganoo";
         
         Set<Character> set = new LinkedHashSet<Character>();
         
          for(int i=0;i <str.length();i++) 
          {
                
                 set.add(str.charAt(i));
                
         }
         
         StringBuffer sb = new StringBuffer();
         
          for(Character c : set) 
          {
                
             sb.append(c);
                
         }
         
         System.out.println(sb);

	}

}

//Output:
//
//Ram Sham Gan