package stringPrgrams;

public class SP103 {

	public static void main(String[] args) {
		// right rotate a String by 1 position
		
		   String str = "pavan1";
           
           char[] a = str.toCharArray(); 
                           
           int size = a.length;
           
           char last = a[size-1]; 
                            
           for(int i=size-1; i>0; i--) 
           { 
                           
               a[i] = a[i-1];
                           
           }
                     
           a[0] = last;
               
           StringBuffer sb = new StringBuffer();
              
           for(char c : a) {
                     
              sb.append(c);   
                     
           }
              
           System.out.println(sb);

	}

}
//op: 1pavan