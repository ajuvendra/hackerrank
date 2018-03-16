package org.home.algorithm.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sumLeft = 0, sumRight = 0;
        int i = 0;
        for(int x = 0, y =n-1; x < n; x++, y--) {
        	sumLeft += a[x][i];
        	sumRight += a[y][i];
        	i++;
        }
        
        int res = Math.abs(sumLeft - sumRight);
        
        System.out.println(res);
    }
}
