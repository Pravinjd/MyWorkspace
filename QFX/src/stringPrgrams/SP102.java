package stringPrgrams;

public class SP102 {

	public static void main(String[] args) {
		// left rotate a String by 3 positions
		
		String srt = "123pavan";
        
        char[] ca = srt.toCharArray(); 
       
        int n = 3;
       
        for(int j=0;j<n;j++) {

               char first = ca[0]; 
              
               int size = ca.length;
              
               for(int i=0;i<size-1;i++) { 
                    
                     ca[i] = ca[i+1]; 
              }
              
               ca[size-1] = first;
       
       }
       
       StringBuffer sb = new StringBuffer();
       
        for(char c : ca) {
              
          sb.append(c);  
              
       }
       
       
       System.out.println(sb);

	}

}

//op:pavan123
