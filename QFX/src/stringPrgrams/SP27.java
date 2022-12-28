package stringPrgrams;

public class SP27 {

	public static void main(String[] args) {
		//   Palindrome String
	
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a String: "); //madam or mom dad
//		String str = s.next();
		
		String str = "madam" ; 
		String org = str;
		String rev="";

		int len = str.length(); // it will

		for (int i=len-1; i >= 0; i--) // 
		{
			rev = rev + str.charAt(i); // p..a..v..a..n
		}
		
		//System.out.println("Revresed string:" +rev_str);
		
		if(org.equals(rev))   //or u can use:  ( orgstr==revstr )
		{
			System.out.println(org + " :its palindrome String");
		}
		else
		{
			System.out.println(org + "  :its not palindrome String");
		}
	}

}
