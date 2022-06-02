package com.syntax.class05;

public class LogicalOrClass5 {

	public static void main(String[] args) {
		// Monday and Friday --> no class 
		//Tuesday and wednesday -> manual testing 
		//thursday -- review 
		//Saturday and Sunday --> java 
		
		String day="Monday";
		
		if ( day.equals("Monday") || day.equals("Friday")) {
			 System.out.println (" I have no class ");
		
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manual Testing class");
			
		} else if (day.equals("Thursday")) {
			System.out.println("I have Review class");
		
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}

	}

}
