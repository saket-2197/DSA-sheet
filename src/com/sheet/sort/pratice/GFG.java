package com.sheet.sort.pratice;
//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GFG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

		// while testcases exist
		while (t-- > 0) {

			String inputLine1[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine1[0]);
			int k = Integer.parseInt(inputLine1[1]);

			ArrayList<Integer> arr = new ArrayList<>();
			String inputLine2[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(inputLine2[i]));
			}

			Solution obj = new Solution();
			obj.reverseInGroups(arr, n, k);

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr.get(i) + " ");
			}
			System.out.println(str);
		}
	}
}

// } Driver Code Ends

//User function Template for Java

class Solution {
	// Function to reverse every sub-array group of size k.
	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = arr.get(i);
		}

		for (int i = 0; i < n; i += k) { // 0

			if (i < n) {// 3<8
				reverse(a, i, Math.min(n, i + k), k); // reverse(a,0,Math.min(8,3))--> reverse(a,0,3)
														// reverse(a,3,6)
			} // reverse(a,6,8)

		}System.out.println(Arrays.toString(a));
		
	}

	private static void reverse(int[] a, int i, int min, int k) {
		int temp; // i=6 min=8 temp=3

		for (int j = 0; j < k / 2; j++) { // 0<3 //1<3 //j=0

			temp = a[i]; // temp=1 //temp=2 //temp=3
			a[i] = a[min - 1-i]; // a[0]=3 //a[1]= //a[6]=5
			a[min - 1-i] = temp; // a[2]=1 //a[7]=3
								// i=1
		}

	}
}
