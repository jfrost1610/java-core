package com.core.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] ar = { 1, 4, -2, 8, 12, 1 };
		int result = 10;

		int[] twoSum = twoSumOptimized(ar, result);
		System.out.println(twoSum[0] + "," + twoSum[1]);

	}

	private static int[] twoSumOptimized(int[] ar, int result) {

		Map<Integer, Integer> diffMap = new HashMap<>();

		for (int i = 0; i < ar.length; i++) {
			int diff = result - ar[i];
			if (diffMap.containsKey(diff)) {
				return new int[] { diffMap.get(diff).intValue(), i };
			}
			diffMap.put(ar[i], i);
		}

		return new int[] { -1, -1 };

	}

	private static int[] twoSum(int[] ar, int result) {

		int[] twoSumResult = new int[] { -1, -1 };
		int i = -1;
		int j = -1;
		boolean flag = false;

		for (i = 0; i < ar.length; i++) {

			for (j = i + 1; j < ar.length; j++) {

				if (ar[i] + ar[j] == result) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}

		}

		if (flag) {
			twoSumResult[0] = i;
			twoSumResult[1] = j;
		} else {
			twoSumResult[0] = -1;
			twoSumResult[1] = -1;
		}

		return twoSumResult;
	}

}
