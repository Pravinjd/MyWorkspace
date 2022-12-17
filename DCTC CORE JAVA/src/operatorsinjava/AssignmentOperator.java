package operatorsinjava;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a=5,b=8;
		
		a+=50;    // a=a+50;
		System.out.println(a);
		
		a+=b;    // a=a+b;
		System.out.println(a);
		
		int x=20;
		x-=10;
		System.out.println(x);
		
		int z=45;
		z*=5;
		System.out.println(z);
		
		int p =25;
		p/=3;
		
		int q =65;
		q%=3;
		System.out.println(q);
		
		int h=12;
		h>>=2;
		System.out.println(h);
		
		int f=8;
		f<<=2;
		System.out.println(f);

	}

}
