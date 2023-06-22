package com.sheet.sort.pratice;

//	0 1 1 2 3 5 8 13
public class Palindrom {

	public static void main(String[] args) {
	
		int a=0, b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
