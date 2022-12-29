package stringPrgrams;

public class SP102 {

	public static void main(String[] args) {
		// left rotate a String by 3 positions
		
		String str = "123pavan"; 
        char[] a = str.toCharArray();             
        int size = a.length;
        int n = 3;
       
        for(int j=0; j<n; j++) 
        {

               char first = a[0];                         
              
               for(int i=0; i<size-1; i++) 
               {                     
                     a[i] = a[i+1];               
               }
              
               a[size-1] = first;
       
       }
       
       StringBuffer sb = new StringBuffer();
       
        for(char c : a) 
        {      
          sb.append(c);                
       }              
       System.out.println(sb);

	}

}

//op:pavan123
