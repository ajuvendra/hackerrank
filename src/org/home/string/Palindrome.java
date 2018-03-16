package org.home.string;

public class Palindrome {
	public static void main(String[] args) {
		String s = "madammadam";
		String res = "Yes";
		for(int i = 0; i < s.length()/2 + 1; i++) {
			if(!(s.charAt(i) == s.charAt(s.length()-1-i))) {
				res = "No";
				break;
			}
		}
		System.out.println(res);
		
	}
}
