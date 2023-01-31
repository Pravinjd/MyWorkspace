package s12;

import java.util.HashMap;
import java.util.Iterator;

public class PriorityQueue {

	public static void main(String[] args) {

		// create hash map
		HashMap<Integer, String> language = new HashMap<>();
		
		//add elements method
		language.put(1, "Java");
		language.put(2, "python");
		language.put(3, "c");
		language.put(4, "c++");
		language.put(5, "ruby");
		
		System.out.println( language );
		
		// get method :  to get element
		String key1 = language.get(1);		
		System.out.println("value at index 1 : " +  key1);
		
		//keyset method- 
		System.out.println("keySet : "+ language.keySet() );
		
		//values method :
		System.out.println("values : "+ language.values() );
		
		//entryset method
		System.out.println("entrySet : "+ language.entrySet() );
		
		//replace method
		language.replace(3, "C#");
		System.out.println(language);
		
		//remove method
		//System.out.println(language.remove(2));   //using only key
		//System.out.println(language.remove(2, "python")); //using key value  returns true/false
		//System.out.println("after removing : " + language );
		
		//containsKey ()
		System.out.println(language.containsKey (6) ); //returns true or false
		
		//containsValue 
		System.out.println(language.containsValue("Java") ); //returns true or false
		
		//size method - return no of pairs 
		System.out.println(language.size());  
		
		//isEmpty methods-returns true/false
		System.out.println(language.isEmpty() );  
		
		//clear method - to remove all elements
		//language.clear();
		//System.out.println(language);
		
		//create another hashmap
		
		HashMap<Integer, String> language2 = new HashMap<>();
		
		language2.put(6, "marathi");
		language2.put(7, "hindi");
		language2.put(8, "telugu");
		System.out.println(language2);
		
		//putAll method
		
		language.putAll(language2);
		System.out.println(language);//{1=Java, 2=python, 3=C#, 4=c++, 5=ruby, 6=marathi, 7=hindi, 8=telugu}
		
		//***how to iterate hashmap ***
		
		for (int i : language.keySet() ) //if u want to read keyset values
		{
			System.out.println( i );
		}
		
		
		System.out.println();
		//using iterator 
		Iterator it = language.keySet().iterator();
		
		while (it.hasNext() )
		{
			System.out.println(it.next() );
		}
	}

}
