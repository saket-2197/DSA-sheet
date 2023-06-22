package com.sheet.sort.pratice;

//lazy 
public class Singleton {

	private static Singleton example = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

	
		if (example == null) {

			synchronized (Singleton.class) { //class level lock 

				if (example == null) {
					example = new Singleton();
				}

			}

		}
		return example;
	}

}
