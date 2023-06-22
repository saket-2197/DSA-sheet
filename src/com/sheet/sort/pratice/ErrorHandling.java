package com.sheet.sort.pratice;

public class ErrorHandling {

	
	//we can catch the error in order to Log monitor it .
	public static void main(String[] args) {
		
		try {
			
			throw new AssertionError();
			
		}catch (Error e) {
			e.getMessage();
			System.out.println("error caught");
		}
	}
}
