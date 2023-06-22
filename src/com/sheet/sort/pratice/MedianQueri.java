package com.sheet.sort.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MedianQueri {

	public static void main(String[] args) throws IOException {

		int arr[] = { 2,4,5,3,1,6};
		int L = 2;
		int R = 4;
		int median = median(arr, arr.length, L, R);
		System.out.println(median);
	}

	private static int median(int[] arr, int n, int L, int R) {

		int[] a = Arrays.copyOfRange(arr, L - 1, R);

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int length = a.length;
		int median;
		 median = length / 2;
		 if(median==0)
		 return a[length-1];
		 else return a[median];

	}
}
