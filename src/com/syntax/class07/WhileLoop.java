package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		int time = 13;
		if (time<12) {
			System.out.println("Morning");//1
		}

	System.out.println("-----------------------");
	
	
	//while(time<12) {
	//	System.out.println("MOrning");
	//}
	
	while(time<12) {
		System.out.println("Morning");// time++ is adding 2 to the time condition 
		time++;
	}
	System.out.println("Hello");
	}

}
