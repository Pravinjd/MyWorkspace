package stringPrgrams;

public class SP101 {

	public static void main(String[] args) {
		//left rotate a String by 1 position
		
		  String str= "1pavan";
          
          char[] a = str.toCharArray();
          
          int size = a.length ;
         
          char first = a[0];
         
         
         
          for(int i=0;i<size-1;i++) 
          { 
                
                 a[i] = a[i+1];
                
         }
         
          a[size-1] = first;
         
         StringBuffer sb = new StringBuffer();
         
          for(char c : a) {
                
             sb.append(c);
                
         }
         
         System.out.println(sb);

	}

}

// op:pavan1