package org.home.algorithm.warmup;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Leaderboard2 {

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

		int[] array = IntStream.of(scores).distinct().toArray();
		int i = array.length - 1;
		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					System.out.println(i + 2);
					break;
				}
			}
			if (i < 0)
				System.out.println(1);
		}
		in.close();
	}
}
