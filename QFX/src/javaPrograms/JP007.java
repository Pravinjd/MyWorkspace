package javaPrograms;

import java.util.Scanner;

public class JP007 {

	public static void main(String[] args) {
		// check whether the given year is a Leap Year
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter year : ");
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		boolean Leapyear = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					Leapyear=true;
				}
				else
				{
					Leapyear=false;
				}
					
			}
			else
			{
				Leapyear=true;
			}
		}
		else
		{
			Leapyear=false;
		}
		
		if (Leapyear==true)
		{
			System.out.println("its a leap year");
		}
		else
		{
			System.out.println("its not a leap year");
		}
		
	}

}
