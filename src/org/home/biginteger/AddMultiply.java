package org.home.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class AddMultiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		BigInteger res = a.add(b);
		System.out.println(res);
		res = a.multiply(b);
		System.out.println(res);
		
	}
}
