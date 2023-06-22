package com.sheet.sort.pratice;

public class SecondLargest {

	public static void main(String[] args) {

		//int a[] = { 6, 8, 2, 4, 3, 1, 5, 7 };
		int a[] = {3,3,3,3,1};
		int max = Integer.MIN_VALUE;

		int sec_max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				sec_max = max;
				max = a[i];

			} else if (a[i] > sec_max && a[i] != max) {
				sec_max = a[i];
			}else if(sec_max==Integer.MIN_VALUE)
				sec_max= -1;
		}
		System.out.println(max);
		System.out.println(sec_max);

	}
}
