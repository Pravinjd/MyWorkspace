package Array_Sort_Elements;

import java.util.Arrays;

public class Array_Bubble_Sort {

	public static void main(String[] args) {
		
		
		int [] a = {40,20,10,50,30};
		System.out.println("Array before sorting :" +Arrays.toString(a));
		
		// Apply BUbble sort technique
		
		int n=a.length;
		
		for(int i=0; i<n-1; i++) // Number of passes 
		{
			for(int j=0; j<n-1; j++)  //Iterations in each pass
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array After sorting :" +Arrays.toString(a));

	}

}
