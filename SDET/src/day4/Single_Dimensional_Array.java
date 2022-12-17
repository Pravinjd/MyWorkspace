package day4;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
	
		/*  method 1:
		 
		int a[]=new int [5];// declared array with size of 5,starting index is 0,last index is 4
		
		//how to store values into array?
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//method 2:
		int a[]= {100,200,300,400,500}; // we can declare an array without specifying size
		
		//how to find the length of an array: arrayname.length=a.length
		
		System.out.println(a.length);     // it will print length of an array
		
		//how to read values from an array
		
		System.out.println(a[2]); // it will read specific value
		
		//now i want to read multiple values:
		
		//for(int i=0;i<=4;i++);  this how we previously doing it (also we can do i<5)
		
		 /* 
		  
		  for(int i=0;i<=a.length-1;i++)  // a.length=5....so we want 5-1=4 thats why we write a.length-1
		  {
			  System.out.println(a[i]); // it wull print 100 200 300 400 500
		  }
		*/
		
		//how to read values using enhanced for loop
		//(specially designed for arrays and easy to use instead of classic for loop)
		
		for (int i :a)
		{
			System.out.println(i);// it will print 100  200 300 400 500 
		}
		
	}

}
