package com.sheet.sort.pratice.interview;

public class EditD {

	public static void main(String[] args) {
		
		String a="peek";
		String b="peesk";
		int c = chg(a,b);
		System.out.println(c);
	}

	private static int chg(String a, String b) {

		int l1 = a.length();
		int l2 = b.length();
		
		int[][] ar=new int[l1+1][l2+1];
		for(int i=0;i<l1+1;i++) {
			
			for(int j=0;j<l2+1;j++) {
				
				if(i==0 &&j==0) ar[i][j]=0;
				else if(i==0) ar[i][j]=ar[i][j-1]+1;
				else if(j==0) ar[i][j]=ar[i-1][j]+1;
				else if(a.charAt(i-1)==b.charAt(j-1)) ar[i][j]=ar[i-1][j-1];
				else {
					int min = Math.max(ar[i-1][j-1], ar[i-1][j]);
					ar[i][j] = 1+Math.min(ar[i][j-1], min);
				}
			}
		}return ar[l1][l2];
			
	}
}
