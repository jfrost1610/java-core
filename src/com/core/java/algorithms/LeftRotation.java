package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(
				new File("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\leftrotation.txt"));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		for (int i = 0; i < d; i++) {
			int j;
			int temp = a[0];
			for (j = 0; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = temp;
		}

		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}
		
		for(Integer cd : a) {
			
		}

		for (int i = 0; i < d; i++) {
			int j;
			int temp = a[a.length - 1];
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}

		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");
		}

		scanner.close();
	}
}
