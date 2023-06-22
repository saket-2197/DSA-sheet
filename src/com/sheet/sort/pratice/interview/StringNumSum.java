
 package com.sheet.sort.pratice.interview;

public class StringNumSum {

	// find the sum of numbers in this string i.e 123 + 34 + 34 = 191
	public static void main(String[] args) {

		String s = "abcd123jnj34nnj34";

		int sum = findSum(s);
		System.out.println(sum);

	}

	private static int findSum(String s) {

		int sum = 0;
		String temp = "0";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";

			}

		}

		return sum + Integer.parseInt(temp);
	}
}
