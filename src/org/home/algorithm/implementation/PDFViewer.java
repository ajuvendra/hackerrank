package org.home.algorithm.implementation;

import java.util.Scanner;

public class PDFViewer {
	static int designerPdfViewer(int[] h, String word) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int result = designerPdfViewer(h, word);
		System.out.println(result);
		in.close();
	}
}
