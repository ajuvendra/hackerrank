package org.home.biginteger;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		int counter = 10;
		String s[] = { "9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
		Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				BigDecimal b1 = new BigDecimal(a);
				BigDecimal b2 = new BigDecimal(b);
				return b1.compareTo(b2);
			}
		}));
		/*for (int i = 0; i < counter - 1; i++) {
			BigDecimal largest = new BigDecimal(s[i]);
			int index = 0;
			boolean found = false;
			for (int j = i + 1; j < counter; j++) {
				BigDecimal b = new BigDecimal(s[j]);
				if (b.compareTo(largest) > 0) {
					largest = b;
					index = j;
					found = true;
				}
			}
			if (found) {
				String temp = s[index];
				s[index] = s[i];
				s[i] = temp;
			}
		}*/
		for (String string : s) {
			System.out.println(string);
		}
	}
}
