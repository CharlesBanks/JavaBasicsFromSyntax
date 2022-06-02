package com.syntax.class09;

public class AllValuesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grade = {'A','B','C','D'};
		/*System.out.println(grade[0];
		 * System.out.println(grade[1];
		 * System.out.println(grade[2];
		 * 
		 */
	
	
	for(int index=0; index<grade.length; index++) {
		System.out.println(grade[index]+" ");
	}
	
	
	
	System.out.println();
	
	String[] words= {"Java", "Saturday", "day"};
	
	//I want to retrieve all elements
	
	for(int i=0; i<=words.length; i++) {
		System.out.println(words[i]+" ");
	}
	
	System.out.println();
	
	/*Enhanced for loop/ advanced for loop/ for each loop
	 * CAN BE USED ONLY WHEN WE WORK WITH ARRY
	 * 			or
	 * 		COLLECTIONS
	 * 
	 */
	
	String[] colors= {"pink", "blue", "white", "black"};
	
			for(String color:colors) {
				System.out.println(color+" ");
				{
	
	
}	
}
}
}
