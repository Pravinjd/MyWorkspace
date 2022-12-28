package ArrayPrograms;

public class AP49 {

	public static void main(String[] args) {
		// search  given element in the array
		
		// search for the given element in the array (linear search)
		//binaery search is also there in pavans videos
		
		 int[] a = {10,20,40,50,30};
         
         int searchElement = 20;
        
         boolean found = false;
        
         for(int i=0;i <a.length ;i++) 
         {    
                if(searchElement ==a[i]) 
                {
                     
                     System.out.println(searchElement +" found at index  "+i);
                     
                      found = true;
                     
                      break;
                     
               }
               
        }
        
         if(!found)   // or if (found==false)
         {
               
              System.out.println(searchElement +" is not found in the array");
         }
	}

}
