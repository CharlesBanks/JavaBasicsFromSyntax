package com.syntax.class05;

public class LogicalOperatorsAnd {

	public static void main(String[] args) {
			
		boolean job=false; 
		double salary=75000;
		
		if(job && salary>=100000) {
		System.out.println("I am super duper happy");
		}

		System.out.println("----------------------");
		
		boolean study=true;
		boolean homework=false;
		boolean pratice=true;
		
		if(study&& homework&& pratice) {
			System.out.println("you will succeed in the course");
		
		}else {
			System.out.println("you will struggle");
		}
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if (num1>num2 && num1>num3){
			System.out.println("the largest number is " + num1);
		
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("largest number is " + num3);
		
		
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 > num1 && num2 > num3);{
		}
		
			
		
	
	}
	
	
	
	}

}
