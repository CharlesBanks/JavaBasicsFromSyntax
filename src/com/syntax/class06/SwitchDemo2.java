package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		
		
		char choice='Y';
		String meaning;
		//Variable and matching cases MUST BE of same type
		//switch does not allow to have duplicated cases
		switch(choice) {
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break; 
		case'N':
			meaning="No";
			break;
			default:
				meaning="Unknown";
			
		}
		System.out.println();

	}

}
