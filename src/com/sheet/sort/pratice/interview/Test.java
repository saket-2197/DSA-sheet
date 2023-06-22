package com.sheet.sort.pratice.interview;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
	
	int a[]= {1,7,3,4,6,10};
	int k=10;
	int n=a.length;
	 ArrayList<Integer> subArray = subArray(a,n,k);
	 System.out.println(subArray);
	
	}

	private static ArrayList<Integer> subArray(int[] a, int n, int k) {
		int i=0;
		int j=0;
		int sum=0;
		ArrayList<Integer> l = new ArrayList<>();
		while(j<n) {
			
			if(sum==k) {
				l.add(i);
				l.add(j);
				
				return l;
			}
			if(sum<k) {
				sum=sum+a[j];
				j++;
				
				continue;
			}
			if(sum>k) {
				sum=sum-a[i];
				i++;
				
				continue;
			}
			
		}
		l.add(-1);
		return l;
	}
}
