package org.home.array;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		int arr[][] = new int[6][6];
		arr[0][0] = -1;
		arr[0][1] = -1;
		arr[0][2] = 0;
		arr[0][3] = -9;
		arr[0][4] = -2;
		arr[0][5] = -2;

		arr[1][0] = -2;
		arr[1][1] = -1;
		arr[1][2] = -6;
		arr[1][3] = -8;
		arr[1][4] = -2;
		arr[1][5] = -5;

		arr[2][0] = -1;
		arr[2][1] = -1;
		arr[2][2] = -1;
		arr[2][3] = -2;
		arr[2][4] = -3;
		arr[2][5] = -4;

		arr[3][0] = -1;
		arr[3][1] = -9;
		arr[3][2] = -2;
		arr[3][3] = -4;
		arr[3][4] = -4;
		arr[3][5] = -5;

		arr[4][0] = -7;
		arr[4][1] = -3;
		arr[4][2] = -3;
		arr[4][3] = -2;
		arr[4][4] = -9;
		arr[4][5] = -9;

		arr[5][0] = -1;
		arr[5][1] = -3;
		arr[5][2] = -1;
		arr[5][3] = -2;
		arr[5][4] = -4;
		arr[5][5] = -5;

		int prevSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
					if (sum > prevSum) {
						prevSum = sum;
					}
			}
		}
		System.out.println(prevSum);
	}

}
