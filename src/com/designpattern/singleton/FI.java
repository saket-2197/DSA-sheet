package com.designpattern.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FI {

	public static void main(String[] args) {

		// nonRepeat();
		//fiEven();
		flatMaPEx();
	}

	private static void nonRepeat() {
		List<Integer> l = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6);
		// Comparator<Integer> c = (a,b)->-a.compareTo(b);
		// Collections.sort(l, c);

		HashMap<Integer, Long> collect = l.stream()
				.collect(Collectors.groupingBy(i -> i, () -> new HashMap<>(), Collectors.counting()));
		Set<Entry<Integer, Long>> entrySet = collect.entrySet();
		for (Entry<Integer, Long> i : entrySet) {
			if (i.getValue() == 1) {
				System.out.println(i.getKey());
			}

		}
		System.out.println(collect);

	}

	private static void fiEven() {

		List<Integer> l = Arrays.asList(1, 3, 5, 6, 8);
		Predicate<Integer> p = i -> i % 2 != 0;
		for (Integer i : l) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}

		//l.stream().filter(i -> i > 5).forEach(i -> l.remove(i));
		System.out.println(l);
		List<Integer> sort = l.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
		System.out.println(sort);
	}
	
	
	private static void flatMaPEx() {
		//List<Integer> list = Arrays.asList(12,3,5,3,6);
		//ArrayList<List<Integer>> l = new ArrayList<>();
		
		 List<List<Integer> > number = new ArrayList<>();
	       
	        // adding the elements to number arraylist
	        number.add(Arrays.asList(1, 2));
	        number.add(Arrays.asList(3, 4));
	        number.add(Arrays.asList(5, 6));
	        number.add(Arrays.asList(7, 8));
	       
		List<Integer> collect = number.stream().flatMap(i->i.stream()).filter(i->i%2==0).collect(Collectors.toList());
		collect.forEach(i->System.out.println(i));
	}
}
