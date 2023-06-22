package com.sheet.sort.pratice.interview;

public class StringNoAdd {

	public static void main(String[] args) {
		String s = "abc123bsn23m";
		findSum(s);
	}

	private static void findSum(String s) {
		int sum=0;
		String temp = "0" ;
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i))) {
				temp = temp + s.charAt(i);
			}else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum);
	}
}
