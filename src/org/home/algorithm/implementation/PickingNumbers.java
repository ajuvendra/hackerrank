package org.home.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
	static int pickingNumbers(int[] a) {
		int[] newA = Arrays.stream(a).distinct().sorted().toArray();
		int result = 0;
		int counter = 0;
		int temp = 0;
		for (int i = 1; i < newA.length; i++) {
			if (newA[i] - newA[i - 1] <= 1) {
				counter = i;
				for (int i1 : a) {
					if (i1 == newA[counter] || i1 == newA[counter - 1])
						result++;
				}
				if (temp < result)
					temp = result;
				result = 0;
			}
		}
		for(int i: newA) {
			for(int i1: a) {
				if(i1 == i) result ++;
			}
			if(temp < result) temp = result;
			result = 0;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = pickingNumbers(a);
		System.out.println(result);
		in.close();
	}
}
