package org.home.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfElements = scan.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i < noOfElements; i++) {
			int totalElement = scan.nextInt();
			ArrayList<Integer> aList = new ArrayList<>();
			for(int j = 0; j < totalElement; j++) {
				aList.add(scan.nextInt());
			}
			list.add(aList);
		}
		System.out.println(list);
		int noOfQueries = scan.nextInt();
		int arr[][] = new int[noOfQueries][2];
		for(int i = 0; i < noOfQueries; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		
		for(int i = 0; i < noOfQueries; i++) {
			try {
				System.out.println(list.get(arr[i][0] - 1).get(arr[i][1] -1));
			} catch (Exception e) {
				System.out.println("!ERROR");
			}
		}
		scan.close();
	}
}
