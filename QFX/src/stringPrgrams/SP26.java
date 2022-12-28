package stringPrgrams;

public class SP26 {

	public static void main(String[] args) {
		//  reverse a String
		
		String str="pravin jadhav";
		
		String rev="";
		
		char [] a =str.toCharArray();
		
		for(int i=a.length-1; i >= 0; i--)
		{
			rev = rev + a[i];
 		}
		
		System.out.println(rev);
	}

}
