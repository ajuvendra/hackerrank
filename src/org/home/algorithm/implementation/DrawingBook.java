package org.home.algorithm.implementation;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p) {
		int result = 0;
		if (p > n / 2 && n % 2 == 0) {
			for (int i = n; i > p; i -=2)
				result++;
		} else if (p > n / 2 && n % 2 != 0) {
			for (int i = n - 1; i > p; i -= 2)
				result++;
		} else {
			for (int i = 1; i < p; i += 2)
				result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = solve(n, p);
		System.out.println(result);
	}
}
