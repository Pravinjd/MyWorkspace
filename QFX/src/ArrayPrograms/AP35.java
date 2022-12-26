package ArrayPrograms;

public class AP35 {

	public static void main(String[] args) {
		// find the duplicate elements in the array using index
		
		//** write explanation in notes

		int[] a = { 3, 4, 5, 3, 6, 4 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) { // compare 3 with rest of the elements

				if (a[i] == a[j]) {

					System.out.println(a[i] + " is duplicated in the array");

				}

			}

		}

	}

}
