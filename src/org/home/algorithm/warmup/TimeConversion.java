package org.home.algorithm.warmup;

import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
		// Complete this function
		String res = "";
		if(s.endsWith("AM")) {
			res = s.replace("AM", "").replace("12", "00");
		}
		else if(s.endsWith("PM")) {
			res = s.replace("PM", "");
			int newVal = Integer.parseInt(res.substring(0, 2)) + 12;
			if(newVal == 24) newVal = 12;
			res = String.valueOf(newVal) + res.substring(2);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
//12:00:00AM
//12:00:00PM