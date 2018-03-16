package org.home.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StudentsGrading {

	static int[] solve(int[] grades) {
		// Complete this function
		int res[] = new int[grades.length];
		int counter = 0;
		for (int i : grades) {
			if(i < 38)
				res[counter] = i;
			else if(i >= 38) {
				int x = 5 - i % 5;
				if(x < 3)
					res[counter] = i + x;
				else
					res[counter] = i;
			}
			counter++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}
}
