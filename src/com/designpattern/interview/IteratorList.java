package com.designpattern.interview;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorList {

	

	public static void main(String[] args) {
		
		//List<Integer> l = new ArrayList<>();
		CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();
		l.add(1);
		l.add(30);
		l.add(50);
		l.add(65);
		
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
			if(next.equals(65)) {
				l.remove(next); // we get concurrent modification exceptions
				//iterator.remove();
			}
		}
		
	}
}
