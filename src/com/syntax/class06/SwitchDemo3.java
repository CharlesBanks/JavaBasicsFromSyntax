package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		
		/*
		 * let's ask a user where is he from
		 * based on the country we will define favorite food 
		 *
		 */

		Scanner scanner=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
		 country=scanner.nextLine();
	
	
		 switch(country) {
		 case "Mexico":
			 favoriteFood="tacos";
			 break;
			 
		 case "Canada":
			 favoriteFood="putine";
			 break;
			 
		 case"Trukey":
			 favoriteFood="Lahacun";
			 break;
			 
		 case "Pakistan":
			 favoriteFood="pati chai";
			 break;
		 case "egypt":
			 favoriteFood="koshary";
			 break;
			 default:
				 favoriteFood="Unknown"
		 }
		 
	System.out.println("you are from "+ country+ " and you favorite food is " + favoriteFood);
	}



}
