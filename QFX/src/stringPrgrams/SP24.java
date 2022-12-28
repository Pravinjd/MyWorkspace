package stringPrgrams;

public class SP24 {

	public static void main(String[] args) {
	// print number of vowels,consonents,letters,digits,spaces ,spcl charactersfrom a string
		
		String str ="Hi My id is @#$% 12345";
		
		String str2=str.toLowerCase();
		
		int vowels=0;
		int consonenets=0;
		int letters=0;
		int digits=0;
		int spaces=0;
		int spclchar=0;
		
		for(int i=0; i<str2.length(); i++)
		{
			char ch = str2.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowels++;
			}
			else if(ch>='a' && ch<='z')
			{
				consonenets++;
			}
			else if (ch>='0' && ch<='9')
			{
				digits++;
			}
			else if (ch==' ')
			{
				spaces++;
			}
			else spclchar++;
				
		}
		
		System.out.println("vowels count is :" + vowels);
		System.out.println("consonenets count is :" + consonenets);
		System.out.println("digits count is :" + digits);
		System.out.println("spaces count is :" + spaces);
		System.out.println("spclchar count is :" + spclchar);
		System.out.println("letters count is :" +(vowels+consonenets));


	}

}
