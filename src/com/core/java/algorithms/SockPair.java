package test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockPair {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> sockMap = new HashMap<>();

		for (Integer a : ar) {
			if (sockMap.get(a) != null) {
				sockMap.put(a, sockMap.get(a) + 1);
			} else {
				sockMap.put(a, 1);
			}

		}

		int count = 0;
		for (Integer value : sockMap.values()) {
			count += value / 2;
		}

		return count;

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\sockpair.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);

		scanner.close();
	}
}
