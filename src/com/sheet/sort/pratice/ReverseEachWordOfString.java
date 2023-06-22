package com.sheet.sort.pratice;

//   i/p-> welcome to java

//	 o/p-> emoclew ot avaj
public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "welcome to java";

		String[] split = str.split(" "); 
		
		String reverseString="";
		
		for(int i=0;i<split.length;i++) { 
			 
			String rev = "";
			String s=split[i];   //to
			for(int j=0;j<s.length();j++ ) {
				rev = s.charAt(j)+rev;  //ot
				
			}
			reverseString = reverseString+  rev + " "; //emoclew ot 
		}
		
		System.out.println(reverseString.trim());
	}
}
