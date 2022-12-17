package day7;

public class Final_variable {

	final int speed=40;  // final variable,so we cannot change its value later
	
	public static void main(String[] args) {
		Final_variable fm=new Final_variable();
		//fm.speed=100;                  //compile time error because int speed is used with final keyword
		System.out.println(fm.speed);

	}

}
