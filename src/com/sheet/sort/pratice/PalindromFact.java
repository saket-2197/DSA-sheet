package com.sheet.sort.pratice;

public class PalindromFact {
	static int a=0,c;
	static int b=1;
	static int n=10;
	public static void main(String[] args) {
		
		
		
		System.out.print(a+" "+b);
		fibo(n);
		
	}

	private static void fibo(int n) {
		
		if(n>0) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibo(n-1);
		}
		
		
	}
}
