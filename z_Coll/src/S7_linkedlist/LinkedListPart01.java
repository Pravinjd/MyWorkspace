package S7_linkedlist;

import java.util.LinkedList;

public class LinkedListPart01 {

	public static void main(String[] args) {

		// Declare linked list
		LinkedList<String> ll = new LinkedList <String> ();

		// add elements
		ll.add("Ravi"); // 0th element
		ll.add("rajesh"); // 1st element
		ll.add("ram"); // 2nd element

		System.out.println(ll);

		// add elements at particular index
		ll.add(1, "uma");
		System.out.println("adding uma at 1st element : " + ll);

		// Declare linked list 2 // colletion 2
		LinkedList<String> ll2 = new LinkedList<String>();
		
		ll2.add("Seeta");
		ll2.add("Radha");
		ll2.add("Geeta");
		
		System.out.println(ll2);
		
		//add collection2 in collection 1		
		ll.addAll(ll2);
		System.out.println("After adding collection : " + ll );
		
		// remove specified element : remove("uma")
		ll.remove("uma");
		System.out.println("after removing uma :" + ll );
		
		//remove element at specific index 
		ll.remove(2); // ram will removed
		System.out.println("After removing 2nd index : " + ll );
		
		//removeAll (ll2)
		ll.removeAll( ll2 );
		System.out.println("after removing collection2 from collection1 : "+ll );
		
		// how to retrive/ get element
		System.out.println(ll.get(1)); //it will print rajesh
		
		//to replace or change value of element
		ll.set( 1, "ganu");  // it will change rajesh to ganu
		System.out.println( ll );
		
		//contain method //check ganu is available or not
		System.out.println(ll.contains("ganu"));
		
		//clear method 
		ll.clear();
		System.out.println( ll );
	
	}

}
