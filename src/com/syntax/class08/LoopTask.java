package com.syntax.class08;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=70; i++) {
		if (i%2==0) {
		sum += i;
		}
		}
	System.out.println("Sum of all odds ="+ sum);
	System.out.println("---------------");
	
	int sum2=0;
	
	for (int i=1; i<70; i++) {
		
	}
	System.out.println("----------------");
	
	
	Scanner input=new Scanner(System.in);
	
	int secret= 24;
	
	System.out.println("Guess secret number from 1 to 25");
	int guess=input.nextInt();
	
	while (guess!= secret) {
		System.out.println("Guess secret number from 1 to 25");
		int guess1 =input.nextInt();
	
	}
	if (guess == secret) {
		System.out.println("Congrats, you guessed the secret number!");
	}
	
	
	
	
	}
}
