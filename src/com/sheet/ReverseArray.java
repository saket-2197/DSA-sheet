package com.sheet;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 65, 7, 8,4,5,90 };
		
		//reveres(a);
		recursion(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static void recursion(int[] a, int i, int j) {
		
		if(i>j) return;
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	
		recursion(a, i+1, j-1);
		
	}

	private static void reveres(int[] a) {

		int n = a.length;
		int temp;

		for (int i = 0; i < n / 2; i++) { // 0 1
			temp = a[i]; // tmp=2 4
			a[i] = a[n - 1 - i]; // 8 7
			a[n - 1 - i] = temp; // 2 4
		}

	}
}
