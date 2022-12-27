package stringPrgrams;

public class SP104 {

	public static void main(String[] args) {
		// right rotate a String by 3 positions
		
		String str = "pavan123";
        
        char[] ca = str.toCharArray();
       
        int size = ca.length;
       
        int n = 3;
       
        for(int j=1;j<=n;j++) {
       
               char last = ca[size-1]; 
              
               for(int i =size-1;i>0;i--) { 
                    
                     ca[i] = ca[i-1];
                    
              }
              
               ca[0] = last;
       
       }
       
       StringBuffer sb = new StringBuffer();
       
        for(char c : ca) {
              
          sb.append(c); 
              
       }
       
       System.out.println(sb);

	}

}

//op:123pavan

