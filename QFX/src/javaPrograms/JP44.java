package javaPrograms;

public class JP44 {

	public static void main(String[] args) {
		// How to generate a random number within the given range
		

        double random = Math.random();
        
        //checking value of randaom
        System.out.println(random);
       
        int range = 15;
       
       System.out.println("Random number in the given range is: "+(int)(random*range));
       
       //used (int) as Type-casting to convert decimal value into integer value

	}

}
