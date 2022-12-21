package Array_sum_of_Elements;

public class Using_Enhanced_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		for(int x :a) //a.length=5-1=4 // 0 1 2 3 4 5 la fail
		{
			sum=sum + x;  //5+2+7+9+6=29
		}
		System.out.println(sum);
	}

}
