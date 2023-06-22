package com.sheet.sort.pratice;

public class RevereseNumber {

	public static void main(String[] args) {
		
		int n=1232;
		//2321
		int rev=0,d;
		while(n>0)
		{
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		System.out.println(rev);
	
		
		//
		StringBuffer buffer = new StringBuffer(String.valueOf(1232));
		StringBuffer re=buffer.reverse();
		System.out.println(re); 
		
	}
	
}
