package org.home.algorithm.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatAndMouse {

	/*
	 * Complete the catAndMouse function below.
	 */
	static String catAndMouse(int x, int y, int z) {
		String result = "";
		if(Math.abs(x - z) < Math.abs(y - z))
			result = "Cat A";
		else if(Math.abs(x - z) > Math.abs(y - z))
			result = "Cat B";
		else if(Math.abs(x - z) == Math.abs(y - z))
			result = "Mouse C";
		return result;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\a.txt"));

		int q = Integer.parseInt(scan.nextLine().trim());

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scan.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0].trim());

			int y = Integer.parseInt(xyz[1].trim());

			int z = Integer.parseInt(xyz[2].trim());

			String result = catAndMouse(x, y, z);

			bw.write(result);
			bw.newLine();
		}

		bw.close();
	}
}
