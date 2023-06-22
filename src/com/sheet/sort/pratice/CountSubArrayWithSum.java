package com.sheet.sort.pratice;

import java.util.HashMap;

public class CountSubArrayWithSum {

	public static void main(String[] args) {

		int a[] = { 1, 5, 7, 1, 3,3};
		int k = 6;
		int n = a.length;
		int pair = getPair(a, n, k);
		System.out.println(pair);
	}

	private static int getPair(int[] a, int n, int k) {

		/*
		 * int count=0; for(int i=0;i<n;i++) {
		 * 
		 * for(int j=i;j<n;j++) { if((a[i]+a[j])==k) { count++; } } }return count;
		 */
		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {

			int key = k - a[i];
			if (map.containsKey(key)) {
				count = count + map.get(key);
			}
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);

		}
		System.out.println(map);
		return count;

	}
}
