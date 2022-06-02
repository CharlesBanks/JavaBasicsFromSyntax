package com.syntax.class05;

import java.util.Scanner;

public class TaskDMV {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
	System.out.println("Please enter your age");
	int age=scanner.nextInt();
	
	if (age>=18) {
		
	System.out.println("i will issue you a drivers licences");
	}
	else {
		System.out.println("I prefer you get a learners permit");
	}
	
	
	}

}
