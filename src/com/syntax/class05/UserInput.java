package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scanner.next();//capture String
		System.out.println(name);
		
		System.out.println("Please enter age");
		int age=scanner.nextInt();//capture double 
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price=scanner.nextDouble(); //capture double
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo=scanner.nextBoolean();//capture boolean
		System.out.print(boo);
		
		System.out.println("Please enter any character");
		char character=scanner.next().charAt(0);
		System.out.println(character);
	
	
	
	
	}

}
