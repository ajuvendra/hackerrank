package org.home.algorithm.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
		// Complete this function
		Arrays.sort(ar);
		int max = ar[n-1];
		int res = 0;
		for(int i = n-1; i >= 0; i--) {
			if(ar[i] == max) res++;
			else break;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
