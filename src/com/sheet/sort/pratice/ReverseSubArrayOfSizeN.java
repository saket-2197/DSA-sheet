package com.sheet.sort.pratice;

import java.util.Arrays;

//reverse sub array group of size K

//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
			/*Input:
			N = 5, K = 3
			arr[] = {1,2,3,4,5}
			Output: 3 2 1 5 4
			Explanation: First group consists of elements
			1, 2, 3. Second group consists of 4,5.*/
public class ReverseSubArrayOfSizeN {

	public static void main(String[] args) {
		//1 2 3   4 5 6    3,5
		//3 2 1	  6 5 4    5 3
		int a[]= {1,2,3,4,5,6 ,3,5}; //4321 5365
		int k=3;
		int n=a.length;
		for(int i=0;i<n;i+=k) {  //0	
			
			if(i<n) {// 3<8
				reverse(a,i,Math.min(n, i+k),k); //reverse(a,0,Math.min(8,3))--> reverse(a,0,3)
												//reverse(a,3,6)
			}									//reverse(a,6,8)
			
			
		}
		System.out.println(Arrays.toString(a));
		
	}

	private static void reverse(int[] a, int i, int min,int k) {
		int temp=0;				//i=6	min=8		temp=3
		
		for(int j=0;j<k/2;j++,i++) {			//0<3		//1<3			//j=0
						
			temp=a[i];			//temp=1	//temp=2					//temp=3
			a[i]=a[min-1-j];		//a[0]=3	//a[1]=						//a[6]=5
			a[min-1-j]=temp;		//a[2]=1								//a[7]=3
								//i=1
		}
		
	}
}
