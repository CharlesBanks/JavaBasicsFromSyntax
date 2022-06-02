package com.syntax.class10;

import java.util.Scanner;

public class Array1DExample {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
	
			/*Create a 2D array of integer values. Print the sum of all numbers.
			 * 
			 */
				int sum = 0;
				int [] myNumbers = {5,6,7,8,9};
									
				for(int index=0; index<myNumbers.length; index++){
					//System.out.println(myNumbers[index]);
					sum = sum + myNumbers[index];
				}
				System.out.println(sum);
				
				
	
	
	
	
	
	
	
	
	
	}

}
