package com.sheet.sort.pratice;

import java.util.ArrayList;

public class MaxMin {

	public static void main(String[] args) {
		
		int a[]= {12,4,53,6,4};
		int max=a[0];
		int min=a[0];
		
		ArrayList<Integer> l = new ArrayList<>();
		ArrayList maxMin = maxMin(a,min,max);
		System.out.println(maxMin);
		
		
	}

	private static ArrayList maxMin(int[] a,int min, int max) {
		ArrayList list = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		list.add(min);
		list.add(max);
		return list;
		
		
	}
}
