package stringPrgrams;

import java.util.Scanner;

public class SP65 {

	public static void main(String[] args) {
		//program which intakes number of seconds 
		//and converts into hours, minutes and secondsub
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds:");
        
         int seconds = scanner.nextInt();
        
         int minutes = seconds/60;
        
         int remainingSeconds = seconds%60;
        
         int hours = minutes/60;
        
         int remainingMinutes = minutes%60;
        
        System.out.println(hours +":" +remainingMinutes +":" +remainingSeconds);
        
        scanner.close();

	}

}

//Output:
//
//Enter the number of seconds:
//56789
//15:46:29
