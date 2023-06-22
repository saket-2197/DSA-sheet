package com.sheet.sort.pratice.interview;

public class Demo {
	//swaping the string 
	public static void main(String[] args) {

		String s1 = "Saket";
		String s2 = "kamble";

		s1 = s1 + s2; // Saketkamble
//		System.out.println(s1);
		s2 = s1.substring(0, s1.length() - s2.length());
		System.out.println(s2);
		s1 = s1.substring(s1.length() - s2.length() - 1, s1.length());
//		System.out.println(s1);


		
	}
}
