package com.sheet.sort.pratice;

import java.util.ArrayList;

public class SubArrayE2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 7, 5 };
		int l = a.length;  //5
		int s = 12;

		ArrayList<Integer> subArray = subArray(a, l, s);
		System.out.println(subArray);
	}

	private static ArrayList<Integer> subArray(int[] a, int l, int s) {

		int i = 0;
		int j = 0;
		int sum = a[0];
		ArrayList<Integer> list = new ArrayList<>();
		while (j < l) {  //0<5  1<5		2<5		3<5		4<5

			if (sum == s) { 

				list.add(i);
				list.add(j);
				return list;
			}
			if (sum < s) {   
				
				j++;					//0<12 		1<12	3<12	6<12 	
				sum = sum + a[j];	//1			3		6		13
							//(0)[1]	1[2]	2[3]	3[4]
				continue;
			}
			if (sum > s) {			//13>12
				sum = sum - a[i];	//13=13-1=12 
				i++;				//0[1]

				continue;
			}
			
			
		}
		
		list.add(-1);
		return list;

	}
}
