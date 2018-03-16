package org.home.algorithm.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class MiniMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		
		BigInteger sum = new BigInteger("0");
		for(int i = 0; i < 5; i++) {
			sum = sum.add(BigInteger.valueOf(arr[i]));
		}
		BigInteger max = new BigInteger("0");
		BigInteger min = sum;
		for(int i = 0; i < 5; i++) {
			max = sum.subtract(BigInteger.valueOf(arr[i])).max(max);
			min = sum.subtract(BigInteger.valueOf(arr[i])).min(min);
		}
		System.out.println(min + " " + max);
	}
}
