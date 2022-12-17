package day2;

public class Jump_statements {

	public static void main(String[] args) {
		//Break command:
		/*for (int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			
			System.out.println(i);
		}*/
		
		
		//continue command: 
		
		/*for (int i=1;i<=10;i++)
		{
			if(i==5) // it will skip 5 and continue
			{
				continue;
			}
			
			System.out.println(i);
		}*/
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==7) // it will skip 3,5,7 and continue
			{
				continue;
		}
			
			System.out.println(i);
		}
	}
	
}

