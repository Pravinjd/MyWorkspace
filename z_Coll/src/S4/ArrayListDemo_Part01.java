package S4;

import java.util.ArrayList;

public class ArrayListDemo_Part01 {

	public static void main(String[] args) {

		// declare ArrayList
		ArrayList al = new ArrayList(); // for hetrogenous data types

		// ArrayList<String> cars = new ArrayList<String>(); //for homogenous data types

		// add data to arraylist

		al.add("java");
		al.add(66);
		al.add('H');
		al.add(12.5);
		al.add(true);

		System.out.println(al); // to print array list
		
		//size method : to find  of  arraylist 
		System.out.println("size of arraylist : " + al.size()); 
		
		//remove method :to remove vaule at index 1;
		//al.remove(1); //  66 will be removed
		//System.out.println("After removing 66 " + al); // to print array list
		
		//get method: to get/access value at particular index :		
		System.out.println("value at index 1 : " + al.get(1) );  //value at index 1 will be printed
		
		
		//set method: used to replcae/change ( will replace java with python)
		al.set(0, "python");
		System.out.println("after set method : " + al) ;
		
		//add method : using index add element 
		al.add(1, 65); //add at particular index
		al.add(false); // default it will add to last
		System.out.println("after add method : " + al);
		
		//contains method : to search element from araylist 
		System.out.println(al.contains("python"));   //(returns true/false) 
		
		//isEmpty method : returns tr/false
		System.out.println( "is arralist empty ? " + al.isEmpty() );
		
		//clear method : to remove all the elements from arrlist
		al.clear();
		System.out.println("after clear method " + al);
		

	}

}
