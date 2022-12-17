package decisionmaking;

public class If_Else_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int per=39;
		
		if(per>100 || per<0)
		{
				System.out.println("Invalid input");
		}
		else if(per>=75)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First class");
		}
		else if(per>=50)
		{
			System.out.println("Second class");
		}
		else if(per>=40)
		{
			System.out.println("Pass");
		}
		
		else 
		{
			System.out.println("Fail");
		}

	}

}
