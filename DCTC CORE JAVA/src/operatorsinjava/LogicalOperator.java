package operatorsinjava;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int a =78,b=56,c=52;
		boolean d = (a<b)&&(a<c);
		System.out.println("value of d :"  +d);
		
		
		int x=25,y=75,z=35;
		boolean u=(x>y)||(x>z);
		System.out.println("value of u :" +u);
		
		boolean r=true && true;
		System.out.println("value of r  :" +r);
		
		boolean e=false || true;
		System.out.println("value of e : " +e);

	}

}
