package org.home.string;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		String s = "";
		if (!s.isEmpty()) {
			String str[] = s.trim().split("[!,?\\.\\_'@ ]+");
			System.out.println(str.length);
			for (String string : str) {
				System.out.println(string);
			}
		} else {
			System.out.println(0);
		}
	}
}
