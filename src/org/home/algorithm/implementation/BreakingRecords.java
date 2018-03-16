package org.home.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {

    static int[] breakingRecords(int[] score) {
    	int max = score[0];
    	int min = score[0];
    	int minMax[] = new int[2];
    	for (int i : score) {
			if(i > max) {
				max = i;
				minMax[0] = minMax[0] + 1;
			} else if(i < min) {
				min = i;
				minMax[1] = minMax[1] + 1;
			}
		}
    	return minMax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
