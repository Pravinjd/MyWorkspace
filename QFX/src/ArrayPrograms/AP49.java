package ArrayPrograms;

public class AP49 {

	public static void main(String[] args) {
		// search for the given element in the array
		
		// search for the given element in the array (linear search)
		//binaery search is also there in pavans videos
		
		 int[] a = {8,1,5,9,12,33,23,7,4,3};
         
         int searchNum = 9;
        
         boolean found = false;
        
         for(int i=0;i <a.length ;i++) 
         {    
                if(searchNum ==a[i]) 
                {
                     
                     System.out.println(searchNum +" is available at the index "+i);
                     
                      found = true;
                     
                      break;
                     
               }
               
        }
        
         if(!found) 
         {
               
              System.out.println(searchNum +" is not found in the array");
         }
	}

}
