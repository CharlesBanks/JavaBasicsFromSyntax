package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkReview {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quiz Score?");
		double Quiz=scanner.nextDouble();
		System.out.println("Mid Term Score?");
		double Term=scanner.nextDouble();
		System.out.println("Final Score?");
		double Final=scanner.nextDouble();
		
		double Average=((Quiz+Term+Final)/3);
		
		if(Average>=90) {
			System.out.println("Your grade is A");
			
		}else if(Average>=70&&Average<90) {
			System.out.println("Your grade is B");
			
		}else if(Average>=50&&Average<70) {
			System.out.println("Your grade is C");
			
		}else if(Average<50){
			System.out.println("Your grade is F");















	
		}
	
	}

}
