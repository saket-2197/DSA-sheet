package com.sheet.sort.pratice;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 65, 7, 8,4,5,90 };
		reveres(a);
		System.out.println(Arrays.toString(a));
	}

	private static void reveres(int[] a) {
		
		int n=a.length;
		int temp;
		
		for(int i=0;i<n/2;i++) {
			temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		
	}

}
