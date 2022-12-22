package Remove_junk_SpeccialChar;

public class Remove_junk_SpeccialChar {

	public static void main(String[] args) {
	
		String str="â€™!@##$$%^%&^&*(&*((*)_+ latin string 01234567890";
		String str2="@#$@#$ java #$%$#$% with !@#$%!@#$% Selenium";
		String str3 = str2.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str3);
				

	}

}
