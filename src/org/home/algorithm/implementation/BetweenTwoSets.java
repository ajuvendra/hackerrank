package org.home.algorithm.implementation;

import java.util.Scanner;

public class BetweenTwoSets {

	private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

	static int lcm(int a[]) {
		int lcm = 1;
		int divisor = 2;
		while (true) {
			int counter = 0;
			boolean divisible = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					return 0;
				} else if (a[i] < 0) {
					a[i] = a[i] * (-1);
				}
				if (a[i] == 1) {
					counter++;
				}

				if (a[i] % divisor == 0) {
					divisible = true;
					a[i] = a[i] / divisor;
				}
			}

			if (divisible) {
				lcm = lcm * divisor;
			} else {
				divisor++;
			}

			if (counter == a.length) {
				return lcm;
			}
		}
	}

	static int getTotalX(int[] a, int[] b) {
		int f = lcm(a);
		int l = gcd(b);
		int count = 0;
		for (int i=f;i<=l;i+=f) {
			if (l % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
