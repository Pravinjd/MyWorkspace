package stringPrgrams;

public class SP21 {

	public static void main(String[] args) {
		//  convert a String to integer
		
//if u try to convert String str ="Pravin"; then it will give NumberFormatException
		
		String str="9";
		
		int num=Integer.parseInt(str);

		//or
		//int num = Integer.valueOf(str); 
		
		
		
		System.out.println(num);
		
		


	}

}
