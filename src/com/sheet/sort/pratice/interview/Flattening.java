package com.sheet.sort.pratice.interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flattening {
	public static void main(String[] args) throws Throwable {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
		Integer[] flattenedArray = flatten(array);
		System.out.println(Arrays.toString(flattenedArray));
	}

	public static Integer[] flatten(Object[] inputArray) throws Exception {
		if (inputArray == null)
			return null;
		List<Integer> flatList = new ArrayList<Integer>();
		
		Arrays.stream(inputArray).forEach(element -> {
			if (element instanceof Integer) {
				flatList.add((Integer) element);
			} else if (element instanceof Object[]) {
				try {
					flatList.addAll(Arrays.asList(flatten((Object[]) element)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");	}});
		
		Integer[] array = flatList.toArray(new Integer[flatList.size()]);
		return array;
	}

}
