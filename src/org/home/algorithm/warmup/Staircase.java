package org.home.algorithm.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++) {
        	for(int j = n; j > i; j--) 
        		System.out.print(" ");
        	for(int k = 0; k < i; k++)
        		System.out.print("#");
        	System.out.println();
        }
    }
}
