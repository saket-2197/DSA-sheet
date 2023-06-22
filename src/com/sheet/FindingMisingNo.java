package com.sheet;

import java.util.Arrays;
import java.util.stream.IntStream;

//  i/p = {1,2,3,5}
// o/p = 4
public class FindingMisingNo {

	public static void main(String[] args) {
		
		//method -1 
		// by using summing all the elements in the arrray and substracting from the total Sn
		
		int a[]= {1,2,3,5};
		
	//	int a[] = { 1, 2, 5, 6, 8, 9 };

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
