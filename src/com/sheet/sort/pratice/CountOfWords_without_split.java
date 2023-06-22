package com.sheet.sort.pratice;

import java.util.ArrayList;
import java.util.List;

/*
Write a program to find number of words from a sentence. "Welcome to Java Programming". Output should be = 4.
You cannot use in-built split() for getting the output. You need to write the logic by yourself.
*/

public class CountOfWords_without_split {
	
	public static void main(String[] args) {
		
		String s ="welcome to java programming";
		
		int count=1;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}System.out.println(count);
	}

}
