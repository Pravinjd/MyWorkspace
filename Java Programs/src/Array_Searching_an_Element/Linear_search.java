package Array_Searching_an_Element;

public class Linear_search {

	public static void main(String[] args) {
		
		// 
	
		int a[] = {10,20,40,50,30};
		
		int searcElement=50; 
		
		boolean flag=false;
		for(int i=0; i<a.length; i++ )
		{
			 //System.out.println(a[i]);
			if(searcElement == a[i])
			{
				System.out.println("Element " +searcElement+ " found at index :" +i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		System.out.println("Element NOt Found");
	}

}
