package org.home.algorithm.implementation;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class HurdleRace {
	static int hurdleRace(int k, int[] height) {
		OptionalInt max = Arrays.stream(height).max();
		return k > max.getAsInt() ? 0 : max.getAsInt() - k; 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}
}
