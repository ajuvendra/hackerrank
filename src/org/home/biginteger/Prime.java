package org.home.biginteger;

import java.math.BigInteger;

public class Prime {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("13");
		String res = n.isProbablePrime(1) ? "prime" : "not prime";
		System.out.println(res);
	}
}
