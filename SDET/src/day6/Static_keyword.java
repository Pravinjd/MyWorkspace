package day6;

public class Static_keyword {

	static int a=10;      // static variable
	       int b=20;      // non-static variable
	       
	
	 static void m1()        //static method
	 {
		 System.out.println("this is m1-static method");
	 }
	 
	        void m2()        //non-static method
	 {
		 System.out.println("this is m2- non static method");
	 }
	 
	 
	   	     
	
	
	public static void main(String[] args) {
		
		
		//1. static methods can only static stuff directly( static variables and static methods) 
		//   (no need to create the object)
		
		System.out.println(a);  //we can directly print value of a.
		 m1();                  //also , we can directly call method m1.
		 
		 
		 //if the static variables and static method are present in other class
		 // that time we have to mention class name
		 //here also no need to create an object
		 //eg. 
		 //System.out.println(Static_keyword.a);
		 //Static_keyword.m1();
		 
		 
		
		//System.out.println(b);  // invalid, because b is non static variable
	    //m2();                   // invalid, because b is non static method
	
		 
		 
	
		 //2.static methods can also access non-static stuff but through object
		 
		 Static_keyword sk=new Static_keyword();                      // object
		 
		 System.out.println(sk.b);       // non static variable through object
		 sk.m2();                        // non static method through object
	
		 
		sk.m3();                         // to call m3 
	}
	
    void m3()        //non-static method
	 {
    	System.out.println("this is m3 non-static method");
	     System.out.println(a);      //calling static variable
	     System.out.println(b);      // calling non-static variable
	     m1();                       //calling static method
	     m2();                       //calling non-static method
	 }
	
	

}
