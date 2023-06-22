package com.sheet.sort.pratice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no.");
		int n=scanner.nextInt();
		
		int f=fact(n);
		System.out.println(f);
	}

	private static int fact(int n) {
		
		if(n==0 || n==1)
			return 1;
		else
		return n*fact(n-1);
	}
}
