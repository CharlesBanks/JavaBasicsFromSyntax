package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
			Scanner input= new Scanner(System.in);
			System.out.println("Enter annual salary");
			int salary=input.nextInt();
			System.out.println("Enter years worked");
			int workedyears=input.nextInt();
			if(workedyears>=5) {
				System.out.println("Youre eligible for a raise");
				
				}
			if (salary>=50000) {
				System.out.println ("youre raise will be 5000");
			}
			else if(salary<=50000){
				System.out.println("youre raise will be 3000");
			}
				
	
	
	}

}
