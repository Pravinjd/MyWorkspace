package Reverse_A_String;

public class Logic1 {

	public static void main(String[] args) {
		
		// 1.using + operator (Sting concatenation operator)
		
		String str= "navap";
		String rev="";
		
		int len=str.length();  //it will give lenth of str1
		
		//if u want extract speacific character from str 1 we use charAt(index no) method
		
		for(int i = len-1 ; i>=0; i--)  //index i = 3...2...1...0..-1...loop will fail
		{
			rev=rev + str.charAt(i);    // p..a..v..a..n
		}
		
		System.out.println("Revresed string:" +rev);

	}

}
