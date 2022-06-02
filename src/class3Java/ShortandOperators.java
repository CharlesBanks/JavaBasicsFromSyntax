package class3Java;

public class ShortandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200

		num=num+50;
		System.out.println(num);//250
		
		num+=100; // num=num+100
		
		num-=10;//num=num-10
		System.out.println(num);//340
		
		num/=10;
		
		num*=2;
		System.out.println(num);
		
		num%=2;
		System.out.println(num);//0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);//30
		
		a+=b+c;// a=a+b+c
		System.out.println(a);//80
		
		a*=10;
		System.out.println(a); //80
	
		int m=10;
		int f=500;
		int h=200;
		m+=f;
		System.out.println(m);
		
		m+=f+h;
		System.out.println(m);
	
	int l=80;
	int x=60;
	l-=x;
	System.out.println(l);
	
	int cakePiece=11;
	
	cakePiece/=4;
	System.out.println(cakePiece);
	
	
	
	
	
	}

}
