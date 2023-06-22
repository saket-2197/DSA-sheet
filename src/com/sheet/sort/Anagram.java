package com.sheet.sort;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a= "bob";
		String b= "bbo7";
		
		char[] ch1 = a.toCharArray();
		
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean equals = Arrays.equals(ch1, ch2);
		if(equals==true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
}
