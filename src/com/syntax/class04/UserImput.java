package com.syntax.class04;

import java.util.Scanner;

public class UserImput {

	public static void main(String[] args) {
		String str="Hello";
		
		//creating a scanner
		Scanner input=new Scanner(System.in);

	
		// send instructions to console
		System.out.println("Please enter your name");
	
	//we need to grab the values from console
	String name=input.next();
	System.out.println(name);
	
	//lets send instruction
	System.out.println(name+ "please enter you age");
	
	// nedd to capture and store age 
	int age=input.nextInt();
	
	System.out.println(name + " is " +age +"years old");
	
	}

}
