package com.sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.*/

// normal approach O(N2) n sq
// we can decreame the time complexity to O(N)

public class SubArraySum {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 7, 5 };
		int n = a.length;
		int s = 12;

		ArrayList<Integer> subarray = subarray(a, n, s);
		System.out.println(subarray);
	}

	private static ArrayList<Integer> subarray(int[] a, int n, int s) {

		int i = 0, j = 0;
		int sum = a[0];
		ArrayList<Integer> l = new ArrayList<>();
		while (i < n) {
			if (sum == s) {
				l.add(j + 1);
				l.add(i + 1);

				return l;
			}
			if (sum < s) {
				i++;
				sum += a[i];
				

				continue;
			}
			if (sum > s) {
				sum = sum - a[j];
				j++;
				continue;
			}

		}
		l.add(-1);
		return l;
	}
}
