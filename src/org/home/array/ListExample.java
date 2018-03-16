package org.home.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int arr[] = new int[2];
			String query = scan.next();
			if (query.equalsIgnoreCase("INSERT")) {
				arr[0] = scan.nextInt();
				arr[1] = scan.nextInt();
				list.add(arr[0], arr[1]);
			}
			if (query.equalsIgnoreCase("DELETE")) {
				arr[0] = scan.nextInt();
				list.remove(arr[0]);
			}
		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		scan.close();
	}
}
