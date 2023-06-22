package com.sheet.sort.pratice;

import java.util.Arrays;
import java.util.OptionalInt;

public class KthSmallestElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,52,51,1};  //1,1,2
		//1st-> 1
		//2nd -> 2
		//3rd -> 4 
		//4th -> 51
		//5th -> 52
		//find the kth smallest element
		
		//method 1 using stream api
		int n=4;
	 OptionalInt findFirst = Arrays.stream(a).distinct().sorted().skip(n-1).findFirst();
	 if(findFirst.isPresent()) {
		 System.out.println(findFirst.getAsInt());
	 }
		
		//method -2
	 /*  public static int kthSmallest(int[] arr, int l, int r, int k) 
    {
        Arrays.sort(arr);
        int smallest = arr[k-1];
        return smallest;
    } 
	   */
	}
}
