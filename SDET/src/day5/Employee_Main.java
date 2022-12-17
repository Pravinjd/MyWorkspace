package day5;

public class Employee_Main {


		public static void main(String[] args) {
			
			Employee emp1 =new Employee();   // created an object here
			
			emp1.eid=101;
			emp1.ename="David";
			emp1.sal=25000;
			emp1.deptno=10;
			emp1.job="Manager";
			
			emp1.display();  //calling display method using object of emp1 
			System.out.println(" ");
			
			
			Employee emp2 =new Employee();   // created 2nd object here
			
			emp2.eid=102;
			emp2.ename="John";
			emp2.sal=55000;
			emp2.deptno=0;
			emp2.job="CEO";
			
			emp2.display();    //calling display method using object of emp2
			
	
			
			System.out.println(emp1.eid);


		}

	

}
