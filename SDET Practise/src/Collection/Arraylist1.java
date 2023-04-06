package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
		//deaclare array
		ArrayList al = new ArrayList ();
		ArrayList <Integer> a2 = new ArrayList <Integer>();
		List <Integer> a3=new ArrayList ();
		
		//add new elements to arralist
		
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al); //[100, welcome, 15.5, A, true]
		
		//size()
		System.out.println(al.size()); // 5 
		
		//remove
		al.remove(3);   // using index
		al.remove("welcome"); //using element
		System.out.println("after removing :" + al);  //[100, 15.5, true]
		
		
		//add in between
		al.add(1,"java");
		System.out.println(al);   //[100, java, 15.5, true]
		
		//get specific element
		System.out.println(al.get(1));   //java
		
		//replace element 
		al.set(2, "python");
		System.out.println(al); //[100, java, python, true]
		
		//search element		
		System.out.println(al.contains("java"));  //true
		
		//isEmpty
		System.out.println(al.isEmpty()); // false bcz al is not empty
		
		//how to read all elements   1.for loop  2.for each loop  3.iterator
		//for loop
		
		for (int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i) + " ");
		}
		
		//fo each loop
		System.out.println();
		for(Object o : al)
		{
			System.out.print(o +" ");
		}
		
		//iterator ( interface )
		System.out.println();
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.print( it.next() + " " );
		}
		
		
	}

}
