package org.home.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);
			if (deque.size() == m) {
				if (max < set.size())
					max = set.size();
				int first = deque.remove();
				if (!deque.contains(first))
					set.remove(first);
			}
		}

		System.out.println(max);
		in.close();
	}
}
