package com.syntax.class10;

public class MoreExamples2DArray {

	public static void main(String[] args) {
			
		int[][] nums= {
				
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787},
			/*
			 * enhanced for loop uses variables to access elements for an array
			 * outer for loops->iterates over 1D array
			 * inner loop--> iterates over elements of each 1D array
			 */
				System.out.println("All values using enhanced for loop");
				
				for (int[]num:nums) {
					
					for(int n:num) {
						
						System.out.print(n);
					}
				}
				
		}
		
		
		
	}

}
