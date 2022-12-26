package javaPrograms;

import java.util.Scanner;

public class JP009 {

	public static void main(String[] args) {
		//  check whether the given character is a Vowel

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any character:");

		char c = scanner.next().charAt(0);

		boolean Vowel = false;

		switch(c) {

		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : Vowel = true;         

		}

		if(Vowel ==true) 
		{
			System.out.println(c+" is a vowel");
		} 
		else 
		{
			System.out.println(c+" is not a vowel");
		}

		scanner.close();

	}


}
