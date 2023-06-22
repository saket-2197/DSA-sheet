package com.sheet;

import java.util.ArrayList;

public class SubArraySum2 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 7, 5 };
		int n = a.length;
		int s = 12;

		ArrayList<Integer> subarray = subarray(a, n, s);
		System.out.println(subarray);
	}

	private static ArrayList<Integer> subarray(int[] a, int n, int s) {
		{
			int i = 0;
			int j = 0;
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<>();

			while (j < n) {
				if (sum == s) {
					list.add(i+1);
					list.add(j);
					return list;
				} else if (sum < s) {
					sum = sum + a[j];
					j++;
				} else if (sum > s) {
					sum = sum - a[i];
					i++;
				}
			}
			list.add(-1);
			return list;
		}
	}
}
