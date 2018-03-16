package org.home.algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class Leaderboard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}

		// Write Your Code Here
		int arr[][] = new int[n][2];
		int rank = 1;
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && scores[i] == scores[i + 1]) {
				arr[i][0] = rank;
				arr[i][1] = scores[i];
			} else {
				arr[i][0] = rank;
				arr[i][1] = scores[i];
				rank++;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = n - 1; j > 0; j--) {
				if (alice[i] > arr[0][1]) {
					System.out.println(1);
					break;
				}
				if (alice[i] < arr[j][1]) {
					System.out.println(arr[j][0] + 1);
					break;
				}
			}
		}
		in.close();
	}
}
