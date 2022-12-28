package Array_Duplicate_String_Elements;

import java.util.HashSet;

public class Logic2_usingHashSet {

	public static void main(String[] args) {
	
		//logic 2 : using HashSet 
		//hashset will not allow duplicate 
		
		String arr [] =  {"java","c","c++","python","Java","java","c++"};
		
		HashSet <String> langs=new HashSet <String> ();
		
		
		boolean flag=false;
		for(String l : arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Duplicate element found :"  +l);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}

	}

}
