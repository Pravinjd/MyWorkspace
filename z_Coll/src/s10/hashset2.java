package s10;

import java.util.HashSet;

public class hashset2 {

	public static void main(String[] args) {
		
		
		HashSet <Integer> setA = new HashSet <Integer> () ;		
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		HashSet <Integer> setB = new HashSet <Integer> () ;
		setB.add(1);
		setB.add(2);
		setB.add(3);
		setB.add(4);
		setB.add(5);

		//union of 2 sets A & B 
//		setA.addAll(setB);
//		System.out.println("union is :" + setA);
		
		//intersection  retainAll method
//		setA.retainAll(setB);
//		System.out.println("intersection is :" + setA);
		
		// Diffrenece
		setA.removeAll(setB);
		System.out.println("Diffrence is :" + setA);
		
		//subset operation 
		//System.out.println(setA.containsAll(setB)); // it will return true/false
	}

}
