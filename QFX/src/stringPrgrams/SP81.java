package stringPrgrams;

public class SP81 {

	public static void main(String[] args) {
		//print the last three letters of the given text

		//		Scanner scanner = new Scanner(System.in);      
		//        System. out.println("Enter any sentence");        
		//        String str = scanner.nextLine();
		//        scanner.close();

		String str = "pavan jadhav123";

		char[] a = str.toCharArray();

		int size = a.length;

		String threeLetters = "";

		for(int i=size-1; i>size-4; i--) 
		{

			threeLetters = threeLetters + a[i]  ;
		}

		System.out.println("Last three letters of the given text is: "+threeLetters);



	}

}

//Output:
//
//Enter any sentence
//pavan jadhav123
//Last three letters of the given text is: 123
