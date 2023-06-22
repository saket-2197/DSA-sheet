package com.sheet.sort.pratice;

public class StringExp {

	private String name;
	private int rollno;

	
	public StringExp(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}


	@Override
	public String toString() {
	
		return name+" "+rollno;
	}
	public static void main(String[] args) {

		StringExp e1 = new StringExp("kolhi", 121);
		
		StringExp e2 = new StringExp("gmam",101);
		
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e2);
	}
}
