package org.home.algorithm.implementation;

import java.util.Scanner;

public class ProgrammerDay {

	static String solve(int year) {
		String result= "";
		int month[] = new int[12];
		month[0] = 31;
		month[1] = 28;
		month[2] = 31;
		month[3] = 30;
		month[4] = 31;
		month[5] = 30;
		month[6] = 31;
		month[7] = 31;
		month[8] = 30;
		month[9] = 31;
		month[10] = 30;
		month[11] = 31;
		
		if(year > 1918 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
			month[1] = 29;
		else if(year < 1918 && year % 4 == 0) month[1] = 29;
		else if(year == 1918) month[1] = 15;
		int sum = 0;
		int i = 0;
		for(; i < 12; i++) {
			if(sum + month[i] > 256) break;
			else 
				sum += month[i];
		}
		int dd = 256 - sum;
		int mm = i + 1;
		result = String.format("%02d.%02d.%04d", dd, mm, year);
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
