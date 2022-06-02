package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {//outer loop controls innner loop
			
			System.out.println(i);
			
			
			for (int y=1; y<=2; y++) {// inner loop depens on the outer loop
				System.out.println(y);
			}
			
		}

	}

}
