package com.sheet.sort.pratice;

public class SwapingString {

	public static void main(String[] args) {
		
		String s1="saket";
		String s2="kamble";
		System.out.println("s1:"+s1+" s2:"+s2);
		s1=s1+s2;
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		s1=s1.substring(s1.length()-s2.length()-1,s1.length());
		
		System.out.println("s1:"+s1+" s2:"+s2);
	}
}
