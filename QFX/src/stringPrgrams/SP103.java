package stringPrgrams;

public class SP103 {

	public static void main(String[] args) {
		// right rotate a String by 1 position
		
		   String str = "pavan1";
           
           char[] ca = str.toCharArray(); 
              
           int size = ca.length;
       
           char last = ca[size-1]; 
                     
           for(int i=size-1;i>0;i--) { 
                           
               ca[i] = ca[i-1];
                           
           }
                     
           ca[0] = last;
               
           StringBuffer sb = new StringBuffer();
              
           for(char c : ca) {
                     
              sb.append(c);   
                     
           }
              
           System.out.println(sb);

	}

}
//op: 1pavan