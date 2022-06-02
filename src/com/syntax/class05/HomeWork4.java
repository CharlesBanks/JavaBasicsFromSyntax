package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Time of day");
		int hours=input.nextInt();
		
		
		if(hours>=1 && hours<=11) {
			System.out.println("Morning");
		}else if (hours>=12 && hours>=15){
			System.out.println("Not morning");
		}
		else if (hours>=16&& hours<=20);{
			System.out.println("Afternoon");
		}
		 if (hours>=21 && hours<=24) {
			System.out.println("Night");
		}
	
	
	
	
	
	}

}
