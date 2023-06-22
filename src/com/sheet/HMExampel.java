package com.sheet;

import java.util.HashMap;

public class HMExampel {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "smks");
		map.put(4, "sa");
		map.put(3, "edfe");
		System.out.println(map); 
		map.remove(12);
		System.out.println(map);                                                                                          
	}
}
