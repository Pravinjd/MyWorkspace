package stringPrgrams;

public class SP82 {

	public static void main(String[] args) {
		// print the first half of the given string text
		

//        Scanner scanner = new Scanner(System.in);        
//        System.out.println("Enter any text");        
//        String str = scanner.nextLine();
//        scanner.close();
		
		String str= "pravin 1234567890 pravin";
        
         int halfsize = str.length()/2;
        
        System.out.println("First half of the given string is: "+str.substring(0,halfsize));
        
        System.out.println(str.length());
        System.out.println("last half of the given string is: "+str.substring(halfsize, 24));
        
       

	}

}
//Output:
//
//Enter any sentence
//pravin 1234567890 pravin
//First half of the given string is: Flip
