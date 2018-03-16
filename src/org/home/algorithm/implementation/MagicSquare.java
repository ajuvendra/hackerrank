package org.home.algorithm.implementation;

import java.util.Scanner;

public class MagicSquare {
	static int formingMagicSquare(int[][] s) {
		int result = 0;
		int sum[] = new int[8];
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
