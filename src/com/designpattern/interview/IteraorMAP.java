package com.designpattern.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteraorMAP {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 30);
		map.put(2, 50);
		map.put(4, 60);
		map.put(5, 70);
		
			Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
			Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
			
			while(iterator.hasNext()) {
				Entry<Integer, Integer> next = iterator.next();
				if(next.getValue()<=30) {
					//iterator.remove();
					map.remove(next.getKey());
				}
			}
			System.out.println(map);
		
		
		
		
	}
}
