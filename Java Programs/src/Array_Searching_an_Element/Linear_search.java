package Array_Searching_an_Element;

public class Linear_search {

	public static void main(String[] args) {
		
		// search for the given element in the array (linear search)
		
		
		int a[] = {10,20,40,50,30};
		
		int searchElement=50; 
		
		boolean found=false;
		
		for(int i=0; i<a.length; i++ )
		{
			 //System.out.println(a[i]);
			if(searchElement == a[i])
			{
				System.out.println("Element " +searchElement+ " found at index :" +i);
				found=true;
				break;
			}
		}
		
		if(found==false)
		System.out.println("Element NOt Found");
	}

}
