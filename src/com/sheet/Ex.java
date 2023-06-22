package com.sheet;

import java.util.ArrayList;
import java.util.Arrays;

//Reveres arry
public class Ex {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 8, 9 };
		// reverse(a,a.length);
		//reverse2(a, 0, a.length - 1);
		//System.out.println(Arrays.toString(a));
		int n = 14;
		ArrayList<Integer> l = subArray(a, n, a.length - 1);
		//o/p: - {2,4}
		System.out.println(l);

	}

	public static int[] reverse(int a[], int l) {

		int i = 0;
		while (i < (l) / 2) { // 0<=2 1
			int temp = a[i]; // temp=1 ,3
			a[i] = a[l - 1 - i]; // a[i]=9, 8
			a[l - 1 - i] = temp; // a[5]=1, 3
			i++;

		}
		return a;
	}

	public static void reverse2(int a[], int i, int j) {

		if (i > j)
			return;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

		reverse2(a, i + 1, j - 1);

	}

	public static ArrayList<Integer> subArray(int a[], int sum, int l) {

		int i = 0, j = 0;
		int s = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (j < l) {

			if (s == sum) {
				list.add(i + 1);
				list.add(j );
				return list;
			}
			if (s < sum) {
				s = s + a[j];
				j++;
				
				continue;
			}
			if (s > sum) {
				
				s = s - a[i];
				i++;
				
				continue;
			}

		}
		list.add(-1);
		return list;

	}

}
