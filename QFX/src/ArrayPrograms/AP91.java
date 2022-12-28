package ArrayPrograms;

public class AP91 {

	public static void main(String[] args) {
		// multiply the corresponding elements in the given two arrays

		int[] a = {1,2,3,4,5};

		int[] b = {5,4,3,2,1};

		for(int i=0;i <a.length; i++) 
		{

			System.out.print(a[i] * b[i]  +" ");

		}

	}

}

//Output:
//
//5 8 9 8 5