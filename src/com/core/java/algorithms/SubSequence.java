package com.core.java.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SubSequence {

	public static void main(String[] args) {
		String result1 = longestSubSeq("AGGTAB", "GXTXAYB");
		String result2 = longestSubSeq("ABAZDC", "BACBAD");
		String result3 = longestSubSeq("aaaaa", "aa");
		String result4 = longestSubSeq("ABBA", "ABCABA");
		String result5 = longestSubSeq("ab", "ABCABA");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

	}

	private static String longestSubSeq(String s1, String s2) {

		List<String> resultList = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			StringBuilder resultCandidate = new StringBuilder();
			String s2Temp = s2;
			for (int j = i; j < s1.length(); j++) {
				int index = s2Temp.indexOf(s1.charAt(j));
				if (index != -1) {
					resultCandidate.append(s1.charAt(j));
					s2Temp = s2Temp.substring(index + 1);
				}
			}
			resultList.add(resultCandidate.toString());
		}

		if (resultList.size() > 0) {
			return resultList.stream().max(Comparator.comparingInt(String::length)).get();
		}
		return "";
	}

}
