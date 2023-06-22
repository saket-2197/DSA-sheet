package com.sheet.sort.pratice;

public class OddEvenNum {

	public static void main(String[] args) {
		
		int a=127549;
		//odd -> 1 ,7,5,9
		//even -> 2,4
		
		int d=0;
		int even=0;
		int odd=0;
		while(a>0) {
			
		d=a%10;
		if(d%2==0) {
			even++;
		}else {
			odd++;
		}
		a=a/10;
		}
		System.out.println("Even:"+even+" Odd:"+odd);
		
		
	}
}
