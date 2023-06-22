package com.sheet.sort.pratice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex {

	static List<Integer> l = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };

		// Integer[] flattenedArray = flatten(array);
		flatten(array);
		// System.out.println(Arrays.toString(flattenedArray));
		System.out.println(l);
	}

	public static void flatten(Object[] array) throws Exception {

		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Object[]) {
				flatten((Object[]) array[i]);
			} else {

				l.add((Integer) array[i]);
				continue;
			}

		}

	}

}