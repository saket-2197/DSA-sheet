package com.sheet.sort.pratice.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exam {

	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String[] words = null;
		try {
			words = br.readLine().split(" ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int out_ = lev(words[0], words[1]);
		System.out.println(out_);

		wr.close();
		br.close();
	}

	static int lev(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int[][] arr = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; i++) {

			for (int j = 0; j <= len2; j++) {

				if (i == 0) {

					arr[i][j] = j;
				} else if (j == 0) {
					arr[i][j] = i;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1];
				} else {
					int min = Math.min(arr[i - 1][j - 1], arr[i][j - 1]);
					arr[i][j] = 1 + Math.min(min, arr[i - 1][j]);
				}
			}
		}
		return arr[len1][len2];
	}
}
