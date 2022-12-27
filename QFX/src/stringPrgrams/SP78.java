package stringPrgrams;

import java.util.Scanner;

public class SP78 {

	public static void main(String[] args) {
		//  find the penultimate word of a sentance

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any sentence");

		String str = scanner.nextLine();

		String[] strarr = str.split(" ");

		int size = strarr.length;

		if(size>1) {

			System.out.println("The penultimate word in the given sentence is: "+strarr[size-2]);

		} else {

			System.out.println("The given sentance has only one word. Hence Penultimate word cannot be printed.");

		}

		scanner.close();

	}

}

//Output:
//
//Enter any sentence
//This is a sample sentence
//The penultimate word in the given sentence is: sample
