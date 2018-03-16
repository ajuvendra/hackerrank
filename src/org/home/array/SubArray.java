package org.home.array;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int arr[] = new int[n];
    	
    	for(int i = 0; i < n ; i++) {
    		arr[i] = scan.nextInt();
    	}
    	
    	int countNegativeSubArray = 0;
    	for(int i = 0; i < n; i ++) {
    		for(int j = n; j >= i; j--) {
    			int sum = 0;
    			for(int k = i; k < j; k++) {
    				sum += arr[k];
    			}
    			if(sum < 0) countNegativeSubArray++;
    		}
    	}
    	System.out.println(countNegativeSubArray);
    }
}