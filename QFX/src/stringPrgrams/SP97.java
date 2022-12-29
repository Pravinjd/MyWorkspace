package stringPrgrams;

public class SP97 {

	public static void main(String[] args) {
		// count number of words in a String
		
//		Scanner scanner = new Scanner(System.in);       
//        System.out.println("Enter any Statement");        
//        String statement = scanner.nextLine();
//        scanner.close();
		
		String str = "pravin sambhaji jadhav"; 
        
        String[] str2 = str.split(" ");
        
        System.out.println("The number of words in the given statement is: "+str2.length);
        
	}

}
//
//Output:
//
//Enter any Statement
//pravin sambhaji jadhav
//The number of words in the given statement is: 3