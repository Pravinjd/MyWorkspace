package s8_stackQueMethods;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class STAck_que_mthods_LInkedLIst {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList<String> cars = new LinkedList<String>();

		cars.add("volvo");
		cars.add("bmw");
		cars.add("tata");
		System.out.println(cars);

		cars.addFirst("mahindra"); // adding element at first
		cars.addLast("nano"); // adding element at last
		System.out.println(cars); // mahindra, volvo, bmw, tata, nano]

		cars.removeFirst(); // it will remove first element
		cars.removeLast(); // it will remove last element
		System.out.println(cars); // volvo, bmw, tata]

		System.out.println(cars.getFirst()); // volvo
		System.out.println(cars.getLast()); // tata

		// push operation used for stack
		// push=add if u want add element in begining stack then use push

		System.out.println(cars);
		cars.push("LANDROVER");
		System.out.println(cars); // [LANDROVER, volvo, bmw, tata]

		// pop - it will remove & return first element
		System.out.println(cars.pop()); // LANDROVER it will remove landrover and return as output
		System.out.println(cars); // [volvo, bmw, tata]

		// peek method : retrive 1st element of the list or returns null if list is
		// empty

		System.out.println(cars.peek()); // volvo -- it will no remove element from list
		System.out.println(cars); // [volvo, bmw, tata]

		System.out.println(cars.peekFirst()); // volvo
		System.out.println(cars.peekLast()); // tata
		System.out.println(cars); // [volvo, bmw, tata] --itwill not remove element from list

		System.out.println();
		// *************HOW TO READ/TRAVERSE ELEMENTS FROM
		// LINKEDLIST***************************

		for (int i = 0; i < cars.size(); i++) 
		{
			System.out.println(cars.get(i)); // i=0=volov i=1=bmw i=2=tata
		}

		// read elements using for each loop
		System.out.println("using for loop ::");

		for (Object e : cars) 
		{
			System.out.println(e); // volvo bmw tata
		}

		// read elements using Iterator
		System.out.println("iterator method ::");
		
		Iterator it = cars.iterator(); // import from java.util
		
		while ( it.hasNext() )       //if next element is exists then it will return true & it wil go inside loop
		{
			System.out.println( it.next() ); // if element exist in it.hasNext() method then it will print it
		}
		
		//***********methods of Collection class *****
		
		System.out.println("**methods of Colloection class ***");
		
		System.out.println("before sorting :" + cars);
		
		//sort linked list
		Collections.sort(cars);
		System.out.println("after sorting :" + cars);
		
		//sort linked list in reverse order
		Collections.sort(cars,Collections.reverseOrder() );
		System.out.println("REVERSE sorting :" + cars);
		
		//shuffle list
		
		Collections.shuffle(cars);
		System.out.println("after Shuffling :" + cars);
	}
}
