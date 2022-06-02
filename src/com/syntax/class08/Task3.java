package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int num=3;
		for (int i=1; i<=50; i++) {
			
		if(i%3==0) {
			continue;
				
		}
		System.out.print(i+" ");
			
			
		}
	Scanner scanner=new Scanner (System.in);
	String answer; 
	do {
		System.out.println("Apply for a credit card");
		answer = scanner.nextLine();
	} while(!answer.equals("yes"));
	
	System.out.println("Thanks");
	
	}

}
