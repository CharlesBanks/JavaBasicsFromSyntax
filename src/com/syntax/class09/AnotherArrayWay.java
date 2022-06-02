package com.syntax.class09;

public class AnotherArrayWay {

	public static void main(String[] args) {
		
		String[] fruits= {"mango", "apple", "kiwi","pear"};
		
		System.out.println(fruits[2]);
		//fruit[4]="peace";Re:ArraysOutOfBoundsException
		
		System.out.println("My favorite fruit is"+fruits[0]);//mango
		
		// I want to find a size of an array/how many elements?
		int size=fruits.length;
		System.out.println(size);
	
	
	
	
	}
}
