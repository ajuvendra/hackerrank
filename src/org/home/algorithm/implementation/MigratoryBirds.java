package org.home.algorithm.implementation;

import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
    	int result = 0;
    	int arr[][] = new int[5][2];
    	for(int i = 0; i < n; i++) {
    		switch (ar[i]) {
			case 1:
				arr[0][1] = arr[0][1] + 1;
				break;
			case 2:
				arr[1][1] = arr[1][1] + 1;
				break;
			case 3:
				arr[2][1] = arr[2][1] + 1;
				break;
			case 4:
				arr[3][1] = arr[3][1] + 1;
				break;
			case 5:
				arr[4][1] = arr[4][1] + 1;
				break;
			default:
				break;
			}
    	}
    	int max = 0;
    	for(int i = 0; i < 5; i++) {
    		if(arr[i][1] > max) {
    			max = arr[i][1];
    			result = i + 1;
    		}
    	}
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
