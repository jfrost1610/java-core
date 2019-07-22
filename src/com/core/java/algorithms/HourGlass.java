package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HourGlass {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {
				int sumtemp = 0;
				sumtemp += arr[i][j];
				sumtemp += arr[i][j + 1];
				sumtemp += arr[i][j + 2];
				sumtemp += arr[i + 1][j + 1];
				sumtemp += arr[i + 2][j];
				sumtemp += arr[i + 2][j + 1];
				sumtemp += arr[i + 2][j + 2];
				maxSum = Math.max(maxSum, sumtemp);
			}
		}

		return maxSum;

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\hourglass.txt"));

		int[][] arr = new int[6][7];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 7; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);

		scanner.close();
	}
}