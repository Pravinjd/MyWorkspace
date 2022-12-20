package MyPractise;

public class String_methods {

	public static void main(String[] args) {
		
		String str = "Hello Hello Hello";
		
		//1.index of method
		System.out.println("index of 1st H :" + str.indexOf('H') );
		System.out.println("index of 2nd H :" + str.indexOf('H',1) );
		System.out.println("index of 3rd H :" + str.indexOf('H',7) );
		
		//2.Printing value which is not into string : verify  out is -1
		System.out.println("index of x :" + str.indexOf('x') );
		
		//StringBuffer methods:
		//1.reverse string: using string buffer
		StringBuffer sb = new StringBuffer("pavan");
			System.out.println(sb.reverse());
		//2.find lenth of sb
			System.out.println(sb.length());
			
		//3.append();
			System.out.println(sb.append("Jadhav"));
		
		//4. insert in between
			System.out.println(sb.insert(5, "-"));
			
		

		
	}

}
