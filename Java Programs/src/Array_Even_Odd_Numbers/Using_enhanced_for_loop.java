package Array_Even_Odd_Numbers;

public class Using_enhanced_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		// even numbers
		
		System.out.println("evn numbers in array");
		for(int x : a) //6 
		{
			if (x%2==0)
			System.out.println(x);
		}
		
		System.out.println("odd numbers in array");
		for(int x : a) //6 
		{
			if (x%2!=0)
			System.out.println(x);
		}


	}

}
