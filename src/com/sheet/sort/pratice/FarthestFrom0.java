package com.sheet.sort.pratice;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.TreeSet;

public class FarthestFrom0 {

	public static void main(String[] args) {
		int n = 5;
		int a[] = { 1, 2, 3, 4, 5, -5 };
		int farthest = farthest(a, n);
		System.out.println(farthest);

	}

	private static int farthest(int[] a, int n) {

		OptionalInt max = Arrays.stream(a).max();
		OptionalInt min = Arrays.stream(a).min();
		int abs = Math.abs(min.getAsInt());
		if (abs >= max.getAsInt())
			return min.getAsInt();
		else
			return max.getAsInt();

	}
}
