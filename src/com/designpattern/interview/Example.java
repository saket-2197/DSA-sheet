package com.designpattern.interview;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		int a[] = { 2, 3, 9, 0, 4, 5, 9, 1 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		int sum = 9;
		int l = a.length;
		sublistSum(a, sum, l);

	}

	private static void sublistSum(int[] a, int sum, int l) {

		int low = 0;
		int high = l - 1;

		while (low < high) {

			if (a[low] + a[high] > sum) {
				high--;
			} else if (a[low] + a[high] < sum) {
				low++;
			} else if (a[low] + a[high] == sum) {
				System.out.println(a[low] + "," + a[high]);
				low++;
				high--;

			}
		}

	}
}
