package org.home.algorithm.implementation;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int valleys = 0;
		int seaLevel = 0;
		char steps[] = s.toCharArray();
		for (char c : steps) {
			switch (c) {
			case 'D':
				seaLevel--;
				break;
			case 'U':
				seaLevel++;
				if(seaLevel == 0) valleys++;
				break;
			default:
				break;
			}
		}
			
		return valleys;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
