package ArrayPrograms;

import java.util.Arrays;

public class AP92 {

	public static void main(String[] args) {
		// merge two different sorted arrays into a third sorted array

		int[] a = {1,2,3,4,5,};

		int[] b = {6,7,8,9,10};

		int as = a.length;
		int bs = b.length;

		int[] c = new int[as+bs];

		int i=0;
		int j=0;
		int k=0;

		while(i<as && j<bs) 
		{

			if(a[i]<=b[j]) 
			{

				c[k] = a[i];

				i++;
				k++;

			} 
			else 
			{

				c[k] = b[j];

				j++;
				k++;

			}

		}

		while(i<as) 
		{

			c[k] = a[i];

			i++;
			k++;

		}

		while(j<bs) 
		{

			c[k] = b[j];

			j++;
			k++;

		}

		System.out.println(Arrays.toString(c));

	}

}
//Output:
//
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
