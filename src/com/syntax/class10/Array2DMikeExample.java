package com.syntax.class10;

public class Array2DMikeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int sum = 0;
		int [][] numbers = { {1,2,3}, {4,5,6},{7,8} };
		//System.out.println(numbers[2][1]);
		
		for(int index=0; index<numbers.length; index++) {
			for(int index2=0; index2<numbers[index].length ; index2++) {
				System.out.println("Sum = " + sum);
				System.out.println("Index = " + index);
				System.out.println("Index2 = " + index2);
				System.out.println("Value = " + numbers[index][index2]);
				System.out.println("Sum = " + sum);
				sum = sum + numbers[index][index2];	
				System.out.println("-------------");
			}
		}
			System.out.println(sum);
	}

}
