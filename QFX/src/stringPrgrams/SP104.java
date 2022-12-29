package stringPrgrams;

public class SP104 {

	public static void main(String[] args) {
		// right rotate a String by 3 positions
		
		String str = "pavan123";
        
        char[] a = str.toCharArray();
       
        int size = a.length;
       
        int n = 3;
       
        for(int j=1; j<=n; j++) 
        {
       
               char last = a[size-1]; 
              
               for(int i =size-1; i>0; i--) 
               {                    
                     a[i] = a[i-1];                    
               }
              
               a[0] = last;      
       
        }
       
       StringBuffer sb = new StringBuffer();
       
        for(char c : a) 
        {
              
          sb.append(c); 
              
       }
       
       System.out.println(sb);

	}

}

//op:123pavan

