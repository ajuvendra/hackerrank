package org.home.array;

import java.util.*;

public class BalancedQuotes {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> quotes = new Stack<>();
		while (sc.hasNext()) {
			boolean res = false;
			String input = sc.next();
			quotes.clear();
			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(i) == '{') || (input.charAt(i) == '(') || (input.charAt(i) == '[')) {
					quotes.push(input.charAt(i));
					res = false;
				} else {
					if (!quotes.isEmpty()) {
						Character out = quotes.pop();
						if ((input.charAt(i) == '}' && out == '{') || (input.charAt(i) == ']' && out == '[')
								|| (input.charAt(i) == ')' && out == '(')) {
							res = true;
						} else {
							res = false;
						}
					} else {
						res = false;
						break;
					}
				}
			}
			if(!quotes.isEmpty()) res = false;
			System.out.println(res);
		}
		sc.close();
	}
}
