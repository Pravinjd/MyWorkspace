package Array_Equal_or_not;

import java.util.Arrays;

public class logic2 {

	public static void main(String[] args) {
		
		// using equals method
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		//first check if the lenght of both arrays are same or not
		
		boolean status=true;
		if(a1.length == a2.length)
		{
			//compare rest of the elements
			for(int i=0; i<a1.length; i++)  //less than symbol
			{
				if (a1[i] != a2[i])
				{
					status=false;
				}
			}
			
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays NOT equal");
		}
		
	}

}
