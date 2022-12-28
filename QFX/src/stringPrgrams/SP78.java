package stringPrgrams;

public class SP78 {

	public static void main(String[] args) {
		//  find the penultimate word of a sentance
		//penultimate word in a sentence is the last but one word.(2nd last word)
		
		

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any sentence");
//		String str = scanner.nextLine();
//		scanner.close();
		
		
		String str = "i";

		String[] strarr = str.split(" ");

		int size = strarr.length;

		if(size>1) 
		{
			System.out.println("The penultimate word in the given sentence is: "+strarr[size-2]);
		} 
		else 
		{
			System.out.println("The given sentance has only one word. Hence Penultimate word cannot be printed.");
		}

	}

}

//Output:
//
//Enter any sentence
//This is a sample sentence
//The penultimate word in the given sentence is: sample
