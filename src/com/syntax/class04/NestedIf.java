package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=false;
		int dose=1;
		
		if(vaccine) {
			System.out.println("Let me check if you got a second dose");
		}
		if (dose==1) {
			System.out.println("You need 1 more shot");
		}else {
			System.out.println("you are fully vacinated");
		
		}
	
	

	System.out.println("-----------------");
	
	String month="June";
	int day=8;
	
	if(month.equals("May")) {
		
		System.out.println("Let me check what is today's date");
		
	}if (day==8) {
		System.out.println("Today is a Mother's Day");
	
	}else if (month.equals("June")) {
		System.out.println("Let me check what day is Father's Day is");
		
		if (day==19) {
			System.out.println("Today is a Father's Day");
		
}
}
}
}