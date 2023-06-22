package com.sheet;

import java.util.Arrays;

public class BinarySearch {

	// find the element present in the array 
	//worst time complexity = O(log n)

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 8, 9 };

		Arrays.sort(a);
		int x=5;
		int low =0;
		int high=a.length-1;
		int n = binarySearch(a, x, low, high);
		if(n==-1) {
			System.out.println("element not found");
		}else
		{
			System.out.println("element found at index:"+n);
		}

	}

	private static int binarySearch(int[] a, int x, int low, int high) {
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(x==a[mid])
				return mid;
			
			else if(x>a[mid]) {
				low=mid+1;
			}
			else if(x<a[mid]) {
				high=mid-1;
			}
		}
		return -1;
		
	}

}
