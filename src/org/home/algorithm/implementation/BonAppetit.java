package org.home.algorithm.implementation;

import java.util.Scanner;

public class BonAppetit {

	static int bonAppetit(int n, int k, int b, int[] ar) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(i != k) sum += ar[i];
		}
		return b - (sum/2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int b = in.nextInt();
		int result = bonAppetit(n, k, b, ar);
		if(result == 0) System.out.println("Bon Appetit");
		else System.out.println(result);
	}
}
