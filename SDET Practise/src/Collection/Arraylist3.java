package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist3 {

	public static void main(String[] args) {
		
		String ar [] = { "Dog","Cat","Elephant"};
		
		for ( String s : ar)
		{
			System.out.println(s);
		}
		
		//convert array int oarraylist
		
		ArrayList al = new ArrayList (Arrays.asList(ar));
		
		System.out.println(al); //[Dog, Cat, Elephant]
	}

}
