package com.syntax.class10;

public class AllElementsFrom2Darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		String[][] usa= {
				
				{"New York", "Albany", "Buffalo"},
						
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
						
				{"Miami", "Orlando", "Niceville","Tampa"},
						
				{"McLean", "Richmond","Leesburg",}
						
		};		
	
		//outer loop iterates over rows
		
		for(int row=0;row<usa.length; row++) {
			
			
			for(int col=0; col < usa[row].length; col++) {
				
				System.out.println(usa[row][col]);
			}
			
			
			
		}
	
	
	
	
	
	
	
	
	
	}

}
