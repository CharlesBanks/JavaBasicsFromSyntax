package com.syntax.class05;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have  credit card? yes or no");
		String answer=scanner.nextLine();
		
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("We will offer you a credit card");
		
		}else {
			System.out.println("What is the balance on the card");
			int balance=input.nextInt();
		}
	}
}
