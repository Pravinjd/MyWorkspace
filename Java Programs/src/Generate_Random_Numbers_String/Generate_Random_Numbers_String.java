package Generate_Random_Numbers_String;

import java.util.Random;

public class Generate_Random_Numbers_String {

	public static void main(String[] args) {

		// Logic 1: using Random class

		Random rnd = new Random();

//		int rnd_int= rnd.nextInt(100); //need to pass paramater here 
//		System.out.println(rnd_int);   //range 0 to 999 max

//		double rnd_dbl=rnd.nextDouble();  //range 0.0 and less than 1.0
//		System.out.println(rnd_dbl);

		// Logic 2 : using Math class
//		System.out.println(Math.random());
		
		//Logic 3: Apache Commons -lang API
		//download jar file and integrtae it java project 
		
		// String rnd_num=RandomStringUtils.randomNumeric(5);
		//System.out.println(rnd_num);
		
		//String rnd_str=RandomStringUtils.randomAlphabetic(5);
		//System.out.println(rnd_str);
		

	}

}
