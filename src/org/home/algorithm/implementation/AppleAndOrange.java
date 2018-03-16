package org.home.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}

		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}

		int appleCounter = 0, orangeCounter = 0;
		for (int i : apple) {
			if(a + i >= s && a + i <= t) appleCounter++;
		}
		for (int i : orange) {
			if(b + i <= t && b + i >= s) orangeCounter++;
		}
		System.out.println(appleCounter);
		System.out.println(orangeCounter);
	}
}
