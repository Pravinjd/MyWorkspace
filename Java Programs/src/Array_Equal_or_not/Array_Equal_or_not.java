package Array_Equal_or_not;

import java.util.Arrays;

public class Array_Equal_or_not {

	public static void main(String[] args) {
		
		// using equals method
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a1,a2);
		
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
