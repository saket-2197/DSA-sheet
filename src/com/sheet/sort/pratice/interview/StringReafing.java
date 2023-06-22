package com.sheet.sort.pratice.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringReafing {

	public static void main(String[] args) throws IOException {
		System.out.println("enter the no");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String d = bf.readLine();
		String readLine = d;
		while(readLine != null) {
			
			System.out.println(d);
			bf.readLine();
		}
	}
}
