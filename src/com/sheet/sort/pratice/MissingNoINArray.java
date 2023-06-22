package com.sheet.sort.pratice;

public class MissingNoINArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6};
		
		// method 1--> to check for presence of each no. in the array complexity O[n2]
		
		// method 2--> to use n(n+1)/2 and find the total sum and them substract it  complexity O[nlog(n)]
		
		//method 3 --> to find the sum of all the elements in the array. and the  find the missing complexity O[n]
		int sum=0;
		
		int l=a.length;
		for(int i=0;i<l;i++) {
			sum=sum+a[i];
		}
		int n=l+1;
		int exp = n*(n+1)/2;
		System.out.println(sum);
		System.out.println(exp);
		System.out.println("req:"+(exp-sum));
		
	}
}
