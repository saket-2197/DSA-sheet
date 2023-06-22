package com.designpattern.interview;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		
		String s="C:\\Users\\SAKET\\OneDrive\\Desktop\\New folder";
		
		File file = new File(s);
		
		File[] files = file.listFiles();
		for(File f:files) {
			
			if(f.isFile()) {
				if(f.getName().endsWith(".pdf")) {
					System.out.println("file-->"+f.getName()+" is a pdf file");
				}else if(f.getName().endsWith(".xlsx")) {
					System.out.println("file-->"+f.getName() +" is a exel file");
				}
			}
			else if(file.isDirectory()) {
				System.out.println("Is a Folder"+file.getName());
			}
		}
	}
}
