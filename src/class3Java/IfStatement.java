package class3Java;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare a variable rate
		 * If rate is more than 5---> I am not buying a house 
		 */
	
		double mortgageRate=5.5;
		
		if (mortgageRate>5){
	
			System.out.println("I am not buying house");
	}

		
	}
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 * if temp is higher than 75-> i will
		 */
		int num1=99;
		int num2=5;
		
	if(num1>num2) {
	System.out.println(num1+" is bigger than "+num2);
	}
	
	int temp=89;
	
	if (temp>75) {//code goes inside if{}
				// when condition is true 	
		System.out.println("I will go for a walk");
		
	}else { // otherwise. Code comes to else {}
			//when condition is false
		System.out.println("I am going to study Java");

	}	
		System.out.println("-----------");
		
		char gender='f';
		
		if (gender=='f');{
			System.out.println("You like shopping");
		}
       }else {
    	   
    	   Sysyem.outprintln("you like watching sports");
      }
       Syste.out.println("-----------");
       
       String browser="chrome";
       
       if (browser.equals("chrome")) {
    	  System.out.println("All test cases will be excuted on chrome");
       }else {
       
       System.out.println("I am not excuting any test cases");
       System.out.println("Reason - wrong browser");
       }
    		   
   
   }

	
}	
