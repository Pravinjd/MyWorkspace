package s9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declare an hashset
		
		//HashSet hs = new HashSet();  // for hetrogenous data
		
		HashSet<String> cars = new HashSet <String> ();  //for homogeneous datat type
		HashSet<String> bikes = new HashSet <String> ();
		
		cars.add("Maruti");  
		cars.add("tata"); 
		cars.add("jaguar"); 
		cars.add("nissan"); 
		cars.add("ford"); 
		cars.add("fortuner");
		cars.add("Maruti");    //duplicate will not be added
		
		bikes.add("splendor");
		bikes.add("ducati");
		bikes.add("R15");
		bikes.add("Duke");
		
	
		System.out.println(cars);
		System.out.println("size:" + cars.size() );
		System.out.println(bikes);
		System.out.println("size:" + bikes.size() );
		
		cars.addAll(bikes); //added bikes into cars
		System.out.println(cars);
		
		//remove specific element
		cars.remove("fortuner");
		System.out.println(cars);
		
		//remove another collection
		cars.removeAll(bikes);
		System.out.println(cars);
		
		//contains method
		System.out.println(cars.contains("tata"));  // true
		
		//contains all method
		System.out.println(cars.containsAll(bikes));  // false
		
		 //isEmpty
		System.out.println(cars.isEmpty());   //   false
		
		//clear method
		//cars.clear();
		System.out.println(cars);  // [ ]  empty list
		
		//to read elemets 
		//for each loop 
		
		for (Object e : cars)
		{
			System.out.println(e);
		}
		
		
		//using Iterator
		
		Iterator it = cars.iterator();
		
		while ( it.hasNext() )
		{			
			System.out.println(it.next());
		}
		
		

	}

}
