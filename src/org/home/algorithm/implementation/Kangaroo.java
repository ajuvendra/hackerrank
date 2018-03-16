package org.home.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		// Complete this function
		String res = "NO";
		if(x1 < x2 && v1 < v2)
			return res;
		if(x1 > x2 && v1 > v2)
			return res;
		x1 = x1 + v1;
		x2 = x2 + v2;
		int initX1 = x1;
		int initX2 = x2;
		while (x1 != x2) {
			if(initX1 < initX2 && x1 > x2) break;
			if(initX1 > initX2 && x1 < x2) break;
			x1 = x1 + v1;
			x2 = x2 + v2;
		}
		if(x1 == x2) res = "YES";
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
}
