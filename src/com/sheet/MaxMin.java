package com.sheet;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
		
		int arr[]= {12,4,53,6,4};
		int l=arr.length;
		int max=arr[0];
		int min=arr[0];
		
		 List<Integer> maxmin = maxmin(arr,l,max,min);
		 System.out.println("max:"+maxmin.indexOf(0)+" "
		 		+ "min:"+maxmin.indexOf(1));
				
		}

	private static List<Integer> maxmin(int[] arr,int l ,int max, int min) {
		int i=0;
		List<Integer> list = new ArrayList<>();
		while(i<l-1) {
			if(max<arr[i])
				max=arr[i];
		
			if(min>arr[i])
				min=arr[i];
			
			i++;
	}
		list.add(max);
		list.add(min);
		
	return list;	
	}
}
