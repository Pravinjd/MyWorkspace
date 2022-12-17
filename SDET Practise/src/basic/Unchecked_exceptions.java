package basic;

public class Unchecked_exceptions {

	public static void main(String[] args) {
		
		int a=20;
		//System.out.println(a/0);    //Arithmetic Exception
		
		String s=null;
		//System.out.println(s.length());  // NullPointerException
		
		String st="abcdef";
		//int i=Integer.parseInt(st);
		//System.out.println(i);          //NumberFormatException
		
		int arr[]=new int[5];             //ArrayIndexOutOfBoundsException
		arr[10]=100; 

	}

}
