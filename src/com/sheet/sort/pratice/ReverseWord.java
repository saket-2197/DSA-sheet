package com.sheet.sort.pratice;


// input-> saket
// output-> tekas
public class ReverseWord {

	public static void main(String[] args) {
		
		String s="saket";
		
		String rev="";
		for(int i=0;i<s.length();i++) {
			
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
	
}
