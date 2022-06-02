package class3Java;

public class PrimitivesCasting {

	//ctlr+space ----> auto complete
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=100;
	double d=100;//widening 
	
	System.out.println(i);//100
	System.out.println(d); //100.0
	
	long l=100987737384848l;
	
	//byte b=130;
	
	//byte b=130; error:cannot convert from int to byte 
	// int x=99.99 error: cannot convert from double to int
	
	int x=(int)99.99;//narrowing
	System.out.println(x);
	
	//Type mismatch: cannot convert from int to byte
	byte b=(byte)130;// Narrowing
	System.out.println(b);
	
	//Type mismatch: cannot convert from double to float
	float f=10.99f;
	
	double dd=9.99;
	
	double price=100;
	
	
	
	
	}

}
