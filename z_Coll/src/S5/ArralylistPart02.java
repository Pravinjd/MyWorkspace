package S5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArralylistPart02 {

	public static void main(String[] args) {

		// declare array list of string type

		ArrayList<String> al = new ArrayList<String>();

		// add elements
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("7");

		System.out.println(al);
		System.out.println(al.size());

		// create another empty arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		System.out.println("before adding empty arraylist: " + al2);

		// addAll method : add al to al2 (al2 is empty right now)
		al2.addAll(al);
		System.out.println("after adding empty arraylist: " + al2);

		//	removeAll method : 
		al2.removeAll(al);
		System.out.println("after removing all empty arraylist: " + al2);
		System.out.println();
		
		//how to iterate (loop through)
		//1.for loop
		
		for (int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println();
		//2.for each loop
		
		for (String i : al)
		{
			System.out.println(i);
		}
		
		
		System.out.println("using iterator");
		//3.using iterator ( it is interface: used to traverse collections or arays in forward direction )
		
		Iterator it = al.iterator();    //import from java.util package
		
		while ( it.hasNext() )   //jar arralst madhe samor ajun konta element asel tr ha true return karto ani loop made ghusto
		                         //pn jar samor konta element nasel tr false reutrn karto ani loop made jat nahi
		{
			System.out.println(it.next());  //jar element asel tr ha to element print karto
		}
		
		
		System.out.println("**sort**");
		//how to sort elements in arraylist : Tyasati apn Collections class use karto
		System.out.println("before sorting: " +al);
		Collections.sort(al);
		System.out.println("After sorting: " +al);
		
		//revrese order madhe sort karnya sati
		Collections.sort( al, Collections.reverseOrder() );
		System.out.println("After reversing: " +al);
		
		//shuffle karnyasati (randomly arlist shuffle karto pratek veli new value diste
		Collections.shuffle(al);
		System.out.println("After shuffling: " +al);
		
		//how to convert array into arralist ( Arrays.asList() method ahe ) 
		//create 1 aray
		String cars []= {"BMW","HONDA","TATA"};
		
		ArrayList al3= new ArrayList(Arrays.asList(cars));

		System.out.println("converted aray into array list: " + al3);

		

	}

}
