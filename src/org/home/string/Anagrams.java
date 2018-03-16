package org.home.string;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if(a.length() != b.length()) return false;
		else {
			a = a.toLowerCase();
			b = b.toLowerCase();
			for(int i = 0; i < a.length(); i++) {
				int counterOfA = 0;
				int counterOfB = 0;
				for(int j = 0; j < a.length(); j++) {
					if(a.charAt(i) == a.charAt(j)) counterOfA++;
					if(a.charAt(i) == b.charAt(j)) counterOfB++;
				}
				if(counterOfA != counterOfB) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String a = "anagram";
		String b = "marganm";
		
		System.out.println(isAnagram(a, b));
	}
}
