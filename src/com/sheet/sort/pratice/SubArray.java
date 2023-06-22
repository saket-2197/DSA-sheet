package com.sheet.sort.pratice;

import java.util.ArrayList;

public class SubArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 7, 5 };
		int n = a.length;
		int s = 12;

		ArrayList subarray = subarray(a, n, s);
		System.out.println(subarray);
		
	}

	private static ArrayList subarray(int[] a, int n, int s) {

		int i = 0, j = 0;
		int sum = a[0];
		
		ArrayList<Integer> l = new ArrayList<>();
		while(i<n) {
			if(sum == s) {
				l.add(j+1);
				l.add(i+1);
				
				return l;
			}
			if(sum < s) {
				i++;
				sum += a[i];
				
				continue;
			}
			if(sum > s) {
				sum = sum - a[j];
				j++;
				continue;
			}
		}l.add(-1);
		return l;

	}
}
