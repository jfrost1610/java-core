package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountValley {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		int level = 0;
		int valleys = 0;

		for (char step : s.toCharArray()) {

			if (step == 'U') {
				level++;
			} else if (step == 'D') {
				level--;
			}
			if (level == 0 && step == 'U') {
				valleys++;
			}
		}

		return valleys;

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\countvalley.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println(result);

		scanner.close();
	}
}
