package com.syntax.class04;

public class MoreNestedExamples {

	public static void main(String[] args) {
		
		/*we need to check if repil was completed 
		 * 
		 * if repil is completed we want to see 
		 * if you did 15 and more-->great job
		 * if you did more than 10--->did good 
		 * if you did less than 10-> try to complete all assignments 
		 */
		
		boolean didRepl=false;
		int assignments=14;
		
		if (didRepl) {
			
			System.out.println("How many assignments have you done");
		}
		if (assignments>15);{
			System.out.println("You did a good job");
			else if(assignments>10) {
			System.out.println("you did a good job");
		} else {
			System.out.println("Please complete all repl assingmnets");
		}
		
		else {
			
			System.out.println("You should complete your repl HW");
		}
	}

}
}