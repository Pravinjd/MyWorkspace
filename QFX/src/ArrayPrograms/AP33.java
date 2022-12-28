package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class AP33 {

	public static void main(String[] args) {
		// Remove duplicates from the array using hashset
		
		int a[]= {1,1,2,2,3,3,4,4,5,5};
		
		HashSet <Integer> set=new HashSet <Integer> ();
		
		for (int i=0; i <a.length ; i++)
		{
			set.add(a[i]);   //hashset will not allow duplicates while adding
		}
		
		//convert hashset into array
		
		Integer[] b = set.toArray(new Integer[set.size()]);
		
		System.out.println( Arrays.toString(b) );

	}

}
