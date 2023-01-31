package ArrayPrograms;

import java.util.ArrayList;

public class Pav {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList <String>();
		al.add("Pune");
		al.add("Goa");
		al.add("Kop");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Kop");

//		//convert list to array
//		String a [] = new String [al.size()];

//		for(int i=0; i<al.size(); i++)
//		{
//			a[i]=al.get(i);
//		}
		
		String a[]=al.toArray(new String [al.size()]);

		//printing array
		for (String j : a )
		{
			System.out.println(j);
		}

		//method:1

		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("found duplicate" +" " +  a[i]);
				}
				
		 	}
		}
	
	}

}
