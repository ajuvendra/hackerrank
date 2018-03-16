package org.home.string;

import java.util.regex.Pattern;

public class RegexCompile {
	public static void main(String[] args) {
		String isPatternValid = "Valid";
		String pattern = "[AZ[a-z](a-z)]";
		try {
			Pattern.compile(pattern.trim());
		} catch (Exception e) {
			isPatternValid = "Invalid";
		}
		
		System.out.println(isPatternValid);
		
	}
}
