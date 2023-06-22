package com.sheet.sort.pratice;

public class Swapping {

	public static void main(String[] args) {
		
		int a=10 , b=20;
		System.out.println("Initailly");
		System.out.println("a:"+a+" b:"+b);
		//logic 1
		System.out.println("--------------Logic-1---------");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a+" b:"+b);
		System.out.println("--------------Logic-2---------");
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("a:"+a+" b:"+b);
		
	}
}
