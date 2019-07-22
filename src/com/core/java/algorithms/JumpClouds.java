package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JumpClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] clouds) {

		int jumps = 0;
		int currentPosition = 0;
		while (currentPosition != clouds.length - 1) {
			if (currentPosition == clouds.length - 2) {
				currentPosition += 1;
			} else {
				int bestCloud = clouds[currentPosition + 2];
				if (bestCloud != 1) {
					currentPosition += 2;
				} else {
					currentPosition += 1;
				}
			}
			jumps++;
		}

		return jumps;

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\jumpclouds.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		System.out.println(result);

		scanner.close();
	}
}
