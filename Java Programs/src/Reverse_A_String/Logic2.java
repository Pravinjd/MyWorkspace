package Reverse_A_String;

public class Logic2 {

	public static void main(String[] args) {
		
		// 2.using character array
		
		String str= "navap`";
		String rev="";
		
		//store all string characters into single array ie. char [] a 
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1; i>=0; i--) //index i = 3...2...1...0..-1...loop will fail
		{
			rev=rev + a[i];        // p..a..v..a..n
		}
		
		
		
		System.out.println("Revresed string:" +rev);

	}

}
