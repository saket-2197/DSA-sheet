package com.sheet.sort.pratice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pratice {

	public static void main(String[] args) {
		Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
		Integer[] flattenedArray = flatten(array);
		System.out.println(Arrays.toString(flattenedArray));
	}

	private static Integer[] flatten(Object[] array) {
		
		List<Integer> l= new ArrayList<>();
		Arrays.stream(array).forEach(i->{
			
			if(i instanceof Integer) {
				l.add((Integer)i);
			}else if(i instanceof Object[]) {
				l.addAll( Arrays.asList(flatten((Object[] )i)));
			}
		});
		
//		Integer[] array = flatList.toArray(new Integer[flatList.size()]);
		Integer[] array2 = l.toArray(new Integer[l.size()]);
		return array2;
	}

	

}
