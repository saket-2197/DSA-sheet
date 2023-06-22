package com.sheet.sort.pratice;

import java.util.Arrays;

public class NegativeToLeft {

	public static void main(String[] args) {

		int a[] = { 10, -1, -2, 3, -4, 6, -6 };
		int n = a.length;
		int[] allNegativeToLeft = allNegativeToLeft(a, n);
		// -1, 10,-2,3,-4,6,-6
		// -1,-2,10,3,-4,6,-6
		// -1,-2,-4,10,3,6,-6
		System.out.println(Arrays.toString(allNegativeToLeft));

	}

	private static int[] allNegativeToLeft(int[] a, int n) {
		int i = 0, j = n - 1;

		while (i < j) {

			if (a[i] < 0 && a[j] > 0) {
				i++;
				j--;
				continue;
			}
			if (a[i] > 0 && a[j] < 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
				continue;
			}
			if (a[i] > 0 && a[j] > 0) {
				j--;
				continue;
			}
			if (a[i] < 0 && a[j] < 0) {

				i++;
				continue;
			}

		}
		return a;
	}
}
