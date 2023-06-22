package com.sheet.sort.pratice;

public class Appp {

	public static void main(String[] args) {
		
		Singleton example1 = Singleton.getInstance();
		
		Singleton example2 = Singleton.getInstance();
		
		System.out.println(example1.equals(example2));
	}
}
