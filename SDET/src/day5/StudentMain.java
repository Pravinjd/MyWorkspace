package day5;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1=new Student(1011,"JOHN",'B');    
		
		
		
	//1st method:Assign values by using reference variables
		/*stu1.sid=1010;
		stu1.sname="John";
		stu1.grade='A';*/
		
	//2nd method: assign values by using method 	
		// stu1.getValues(1010, "john", 'A');
		
	//3rd method :: Assigned value by using constructor
		//just put the parameters inFront of object
				
		
		
		
		
		stu1.display();

	}

}
