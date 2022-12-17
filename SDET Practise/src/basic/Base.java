package basic;

public class Base {

	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*
	Base (int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
		
	}*/

	void display()
	{
	
		System.out.println (empid);
		System.out.println (empname);
		System.out.println (salary);
		System.out.println (deptno);
		
	}
	
	public static void main(String args[])
	{
		//method 1: Assigning values to class variables using object
		/*
		Base bse=new Base();// first emplayee base
		bse.empid=101;
		bse.empname="pravin";
		bse.salary=10000;
		bse.deptno=1;
		
		bse.display();
		*/
		/*
		Base bse2=new Base(); // 2nd employee  base
		bse2.empid=102;
		bse2.empname="ganesh";
		bse2.salary=20000;
		bse2.deptno=2;
		
		bse2.display();
		*/
		
		//Method 2: Assigning values to class variables using constructor
	   /*
		Base bse1=new Base(101, "Pravin", 25000, 10);
		bse1.display();
		
		Base bse2=new Base(102, "Ravina", 15000, 11);
		bse2.display();    
		*/
		
		Base s=new Base();
		s.get(101, "RAJ", 15000, 13);
		s.display();
	
		
		Base s1=new Base();
		s1.get(102, "madhu", 18000, 14);
			s1.display();
		}
	
	// 3rd method: Assigning values to class variables using method:
	     void get (int id, String name,int sal,int dno)
	    {
		    empid=id;
		   empname=name;
		   salary=sal;
		   deptno=dno;
	    }
	
	
	

}




