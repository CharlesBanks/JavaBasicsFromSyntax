package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// print numbers from 1 to 10;
		
		int num=1;
		
		
		while(num<=10) {
			//num++: makes num = 2
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		
		int num1=0;
		
		while(num1<10) {
			num1++;
			System.out.print(num1+" ");
		}
		// print numbers from 10 to 100:
		System.out.println();
		
		int a = 10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
	
			//print numbers from 10 to 1 
		
			int b=10;
			
			while (b<=1) {
				System.out.print(b+" ");
				b--;
			}
	
	System.out.println();
	
	int c=100;
	while(c>=50) {
		System.out.print(c+" ");
		c--;
	}
	int d= -1;
	while(d<=-10) {
		System.out.print(d+" ");
		d--;
	}
	System.out.println();
	
	
	int f=2;
	while (f<=20) {
		System.out.print(f+" ");
		f+=2;
	}
	
	//2 way 
	int h= 1; 
	
	while( h<=20) {
		
	if (h % 2 == 0) {
		System.out.print(h + " ");
		
		h++;
	}
		
		
	}
	
	
	
	
	
	
	
	}
}
