package day4;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		
		//if u  "know" the size of an array then: use below method
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		//if u "dont know" the size of an array then: use below method
		
		//int a[][]= {  {100,200}, {300,400}, {500,600}  };
		
		
		System.out.println("Number of rows:" + a.length );
		System.out.println("Number of columns:" + a[0].length);
		//---------------------------------------------------------------
		
		
		/*
		for (int i=0; i<a.length; i++) // this is called outer loop  (starting value of i=0)
		{
			for(int j=0; j<a[i].length; j++) // this is called inner loop (starting value of j is also 0)
			{
				System.out.println(a[i][j]);
			}
		}
		*/
		//--------------------------------------------------------------------------------------
		//Enhanced for loop: (here we dont have any index concept)
		
		for (int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
			
		}
		
		
	
	
			
	}

}
