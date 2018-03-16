package org.home.array;

import java.util.BitSet;
import java.util.Scanner;

public class BitOperation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalNo = in.nextInt();
		int operations = in.nextInt();
		BitSet b1 = new BitSet(totalNo);
		BitSet b2 = new BitSet(totalNo);
		b1.set(2, true);
		/*for(int i = 0; i < operations; i++) {
			String op = in.next();
			int a = in.nextInt();
			int b = in.nextInt();
		}*/
		b1.and(b2);
		System.out.println(b1);
		System.out.println(b2);
	}
}
