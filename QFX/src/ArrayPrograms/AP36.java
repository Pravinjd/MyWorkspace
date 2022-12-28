package ArrayPrograms;

import java.util.HashSet;

public class AP36 {

	public static void main(String[] args) {
		// find the duplicate element in the array using HashSet

		int[] a = {3,4,5,3,6,4};  //3 & 4 are duplicated elements 

		HashSet<Integer> hset = new HashSet<Integer>();

		for(int i=0;i<a.length;i++) 
		{ 
			if(hset.add(a[i])==false) 
			{
				System.out.println(a[i]+" is duplicated");
			}
		}
	}

}
