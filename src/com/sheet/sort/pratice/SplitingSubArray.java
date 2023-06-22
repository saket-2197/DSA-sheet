package com.sheet.sort.pratice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* expected Output 
[0, 1, 2]
[3, 4, 5]
[6, 7, 8]
[9]
*/
public class SplitingSubArray {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		int n=a.length;
		ArrayList<int[]> split = split(a,splitSize,n);
		split.stream().forEach(i->System.out.println(Arrays.toString(i)));		
	}

	private static ArrayList<int[]> split(int[] a, int split,int n) {
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int i=0;i< a.length; i+=split) {  //0<10 

			int[] copyOfRange = Arrays.copyOfRange(a, i, Math.min(i+split, n));  //cp(a,0,3)
		//	System.out.println(Arrays.toString(copyOfRange));
			list.add(copyOfRange);
			
		}
		return list;
	
	}

}
