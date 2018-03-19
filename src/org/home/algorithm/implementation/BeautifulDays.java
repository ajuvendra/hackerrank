package org.home.algorithm.implementation;

import java.util.Scanner;

public class BeautifulDays {
	static int beautifulDays(int i, int j, int k) {
		int result = 0;
		for(int a = i; a < j; a++) {
			String s = new StringBuilder(String.valueOf(a)).reverse().toString();
			if(Math.abs(a - Integer.valueOf(s)) % k == 0) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int result = beautifulDays(i, j, k);
		System.out.println(result);
		in.close();
	}
}
