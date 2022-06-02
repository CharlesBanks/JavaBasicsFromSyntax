package class3Java;

public class IfNoBraces {

	public static void main(String[] args) {
		// without braces java can identify only 1 statement per block
		
		String time="Morning";
		
		if (time.equals("Moring")) {
			System.out.println("Say Good Morning");
			
		}else {
			System.out.println("Say Good Day");
			System.out.println("or say good evening");
		
		}

	}

}
