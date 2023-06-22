package com.sheet.sort;

import java.util.Arrays;

//time complexity O(n2)
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {36,19,29,12,5};  //{5,12,19,29,36}
		int n=a.length;
		sort(a,n);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a, int n) {
		
		int temp=0;
		for(int i=0;i<n;i++) {
			int flag=0;
			for(int j=0;j<n-1-i;j++) {
				
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
		}
		
	}
}
