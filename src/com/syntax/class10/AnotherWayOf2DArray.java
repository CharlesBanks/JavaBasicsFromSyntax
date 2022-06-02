package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		// create 2d array of states 
		/*
		 * 1 array --> NY--> all cities of NY state
		 * 2 array --> CA-->all cities of CA state 
		 */

		String[][] usa= {
				
		{"New York", "Albany", "Buffalo"},
				
		{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				
		{"Miami", "Orlando", "Niceville","Tampa"},
				
		{"McLean", "Richmond","Leesburg",}
				
				
	};
	System.out.println(usa[1][2]);
	System.out.println("I want to go to "+usa[2][0]);
	
	System.out.println("Total number of 1D arrays in area use ="+usa.length);
	
	// I want to see how many elements inside my first array
	int elem1array=usa[0].length;
	System.out.println("number of elements in 1 array = "+elem1arry);
	}

}
