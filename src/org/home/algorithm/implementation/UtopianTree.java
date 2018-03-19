package org.home.algorithm.implementation;

import java.util.Scanner;

public class UtopianTree {
	static int utopianTree(int n) {
		int initialVal = 1;
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) initialVal *= 2;
			else initialVal += 1;
		}
		return initialVal;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int result = utopianTree(n);
			System.out.println(result);
		}
		in.close();
	}
}
