package com.designpattern.singleton;

public class Example {

	public static void main(String[] args) {
		
		
		
		Singleton getsingleton = Singleton.getsingleton();
		System.out.println(getsingleton.hashCode());
		
		Singleton getsingleton1 = Singleton.getsingleton();
		System.out.println(getsingleton1.hashCode());
	}

}
 class Singleton{
	
private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getsingleton() {
		
		if(singleton==null) {
			singleton= new Singleton();
	
		}
		
		return singleton;
	}
}
