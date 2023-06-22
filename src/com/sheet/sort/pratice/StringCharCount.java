package com.sheet.sort.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Input: VVVVVTTTTKKKVV
//Output: 5V4T3K2V
public class StringCharCount {

	public static void main(String[] args) {

		String s = "VVVVVTTTTKKKVV";
		int count = 0;
		char c = s.charAt(0);
		ArrayList l = new ArrayList<>();
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length; i++) { // i<14
			int j = i; // j=0;

			if (i == ch.length) {
				l.add(count);
				l.add(c);
				break;
			}
			if (ch[i] == c) { // V==V
				count++;

				continue;

			} else {
				l.add(count);
				l.add(c);
				c = ch[i];
				count = 1;
			}
		}
		l.forEach(i->System.out.print(i));
	}
}
