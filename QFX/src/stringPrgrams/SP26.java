package stringPrgrams;

public class SP26 {

	public static void main(String[] args) {
		//  reverse a String
		
		String str="pravin jadhav";
		
		String revstr="";
		
		char [] ch =str.toCharArray();
		
		for(int i=ch.length-1; i >= 0; i--)
		{
			revstr = revstr + ch[i];
 		}
		
		System.out.println(revstr);
	}

}
