package day5;

//we can assign values to variables in 3 ways:
//1. By using reference variable 
//2. By using method
//3. By using constructor

public class Student {

	int sid;
	String sname;
	char grade;
	
	Student(int id, String name, char g) //this is constructor 
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void getValues(int id, String name, char g) //this is method (method can take parametrs)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	void display()
	{
		System.out.println(sid + " " + sname + " " + grade);
	}
	
	
	
	
}


