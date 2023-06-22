package com.sheet.sort.pratice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 2, 5, 6, 7, 2, 56, 9 };
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}System.out.println();
		int low = 0;
		int high = a.length - 1;
		int n = 9;
		int x=binarySearch(a, n, 0, high);
		if(x==-1) {
			System.out.println("element not found");
		}else
		{
			System.out.println("element found at index:"+x);
		}
	}

	public static int binarySearch(int a[], int n, int low, int high) {

		while(low <= high) {
			int mid = low +(high-low)/2;
			
			if(n== a[mid]) {
				return mid;
			}
			else if(n>a[mid]) {
				low=mid+1;
				continue;
			}else if(n<a[mid]) {
				high=mid-1;
				continue;
			}
		}
		return -1;
	}

}