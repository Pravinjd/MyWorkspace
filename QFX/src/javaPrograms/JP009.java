package javaPrograms;

import java.util.Scanner;

public class JP009 {

	public static void main(String[] args) {
		//  check whether the given character is a Vowel(a.e.i.o.u & A.E.I.O.U)

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any character:"); // "RAM"  or u can ente 'R'

		char c = scanner.next().charAt(0); //  it will take input value at 0th index  
		
		//char c='R';   or u can directly give like this
		

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
			System.out.println( c+" is a vowel");
		} 
		else 
		{
			System.out.println( c+" is not a vowel");
		}

		scanner.close();

	}


}
