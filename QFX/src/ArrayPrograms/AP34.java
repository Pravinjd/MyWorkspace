package ArrayPrograms;

public class AP34 {

	public static void main(String[] args) {
		// Remove duplicates from Sorted Array using index

		int[] a = { 3, 4, 4, 5, 5, 5, 6, 7, 9, 9 };

		int j = 0;

		for (int i = 0; i < a.length - 1; i++) 
		{
			if (a[i] != a[i + 1]) 
			{
				a[j] = a[i];

				j++;
			}
		}

		a[j] = a[a.length - 1];

		for (int k = 0; k <= j; k++) {

			System.out.print(a[k] + " ");

		}

	}

}
