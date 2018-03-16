package org.home.algorithm.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(i != j) {
					if((ar[i] + ar[j]) % k == 0) {
						System.out.println(ar[i] + " : " + ar[j]);
						result++;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
