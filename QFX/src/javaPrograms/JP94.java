package javaPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JP94 {

	public static void main(String[] args) {
		//  find the IP Address of the given website

		//		 Scanner scanner = new Scanner(System.in);
		//         
		//         System.out.println("Enter the website");
		//         
		//         String website = scanner.nextLine();

		String website="www.flipkart.com";

		try 
		{
			InetAddress ip = InetAddress.getByName(website);
			System.out.println("IP Address of the given website is: "+ip);
		} 
		catch(UnknownHostException e) 
		{
			System.out.println("Given website is not found");
		}

		//scanner.close();

	}

}

//Output:
//
//Enter the website
//www.flipkart.com
//IP Address of the given website is: www.flipkart.com/163.53.78.110