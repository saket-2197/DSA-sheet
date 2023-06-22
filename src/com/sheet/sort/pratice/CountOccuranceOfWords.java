package com.sheet.sort.pratice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceOfWords {

	public static void main(String[] args) {
		
		String s="saket saket kamble kamble";
		
		String[] split = s.split(" ");
		
		//method-1
	//	Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
//		System.out.println(collect);
		
		Map<String, Long> c = Arrays.stream(split).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		System.out.println(c);
	
	}
}
