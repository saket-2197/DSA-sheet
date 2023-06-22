package com.designpattern.interview;

public class MainE {

	public static void main(String[] args) {
		
		Mythread t = new Mythread();
		t.setPriority(10);
		t.start();
		
		/*
		RunnableThread r = new RunnableThread();
		Thread thread = new Thread();
		//thread.start();
		r.run();
		*/
		
		for(int i=0;i<20;i++) {
			System.out.println("Main thread");
		}
	}
}
