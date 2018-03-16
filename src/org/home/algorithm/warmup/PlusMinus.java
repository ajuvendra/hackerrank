package org.home.algorithm.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int positiveNumbers = 0, negativeNumbers = 0, zeros = 0;
        
        for(int i = 0; i < n; i++) {
        	if(arr[i] < 0) negativeNumbers++;
        	else if(arr[i] > 0) positiveNumbers++;
        	else zeros++;
        }
        double positiveFraction = (double)positiveNumbers / n;
        double negativeFraction = (double) negativeNumbers / n;
        double zeroFraction = (double) zeros / n;
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        System.out.println(numberFormat.format(positiveFraction));
        System.out.println(numberFormat.format(negativeFraction));
        System.out.println(numberFormat.format(zeroFraction));
    }
}
