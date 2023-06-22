package com.sheet.sort.pratice;

import java.util.Arrays;

/*
 Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}
 */
public class DutchFlag {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 0, 1, 2 };
		int n = a.length;
		ducthFlag(a, n);
	}

	private static void ducthFlag(int[] a, int n) {

		int l = 0, h = n - 1;
		int mid = 0;
		// logic before 'l' every this is -ve
		// after 'h' every thing sould be +ve
		int temp;
		while (mid <= h) {
			if (a[mid] == 0) {
				temp = a[l];
				a[l] = a[mid];
				a[mid] = temp;
				l++;
				mid++;
				continue;
			}
			if (a[mid] == 1) {
				mid++;
				continue;
			}
			if (a[mid] == 2) {
				temp = a[mid];
				a[mid] = a[h];
				a[h] = temp;
				h--;
				continue;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
