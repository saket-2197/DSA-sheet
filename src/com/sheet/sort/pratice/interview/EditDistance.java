package com.sheet.sort.pratice.interview;

public class EditDistance {

	public static void main(String[] args) {
		
		String a="CREATE";
		String b="CAT";
		int lev = lev(a,b);
		System.out.println(lev);
	}

	private static int lev(String a, String b) {
		
		int length = a.length();
		int length2 = b.length();
		int[][] t =new int[length+1][length2+1];
		for(int i=0;i<=length;i++) {
			
			for(int j=0;j<=length2;j++) {
				
				if(i==0 && j==0)
					t[i][j]=0;
				else if(i==0) t[i][j]=t[i][j-1]+1;
				else if(j==0) t[i][j]=t[i-1][j]+1;
				else if(a.charAt(i-1)==b.charAt(j-1)) t[i][j]=t[i-1][j-1];
				else {
					int min = Math.min(t[i-1][j-1], t[i-1][j]);
					t[i][j]=Math.min(t[i][j-1], min)+1;
				}
			}
			
		}return t[length][length2];
		
	}
}
