package test;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DynamicArray {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:\\jxt245\\Eclipse Workspace\\POC\\test\\src\\test\\dynamicarray.txt"));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = dynamicArray(n, queries);

		System.out.println(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		int lastAnswer = 0;
		List<Integer> lastAnswerList = new ArrayList<>();

		List<List<Integer>> seqList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<>());
		}

		for (List<Integer> query : queries) {

			int type = query.get(0);
			int x = query.get(1);
			int y = query.get(2);

			if (type == 1) {
				int index = (x ^ lastAnswer) % n;
				seqList.get(index).add(y);
			} else if (type == 2) {
				int index = (x ^ lastAnswer) % n;
				int size = seqList.get(index).size();
				lastAnswer = seqList.get(index).get(y % size);
				lastAnswerList.add(lastAnswer);
			}

		}

		return lastAnswerList;

	}
}
