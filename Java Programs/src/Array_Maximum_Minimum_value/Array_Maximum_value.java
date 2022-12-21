package Array_Maximum_Minimum_value;

public class Array_Maximum_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {50,30,40,20,60};
		
		//will compare 0th element with all other elements & so on
		
		int min=a[0];   //50 
		
		for(int i=1; i<a.length; i++)  //less than symbol
		{
			if(a[i] < min)   //30>50
			{
				min=a[i];
			}
		}
		
		System.out.println("maximum element in array  is " +min);
	}

}
