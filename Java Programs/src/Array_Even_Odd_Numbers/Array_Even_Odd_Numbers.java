package Array_Even_Odd_Numbers;

public class Array_Even_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		//extract even numbers
		
		System.out.println("evn numbers in array");
		for(int i=0; i<a.length; i++) //6 
		{
			if (a[i]%2==0)
			System.out.println(a[i]);
		}
		
		System.out.println("odd numbers in array");
		for(int i=0; i<a.length; i++) //6 
		{
			if (a[i]%2!=0)
			System.out.println(a[i]);
		}


	}

}
