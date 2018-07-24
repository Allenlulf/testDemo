package com.leetcode.test;

public class test38 {
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}

	public static String countAndSay(int n) {
		return say(4);
	}

	public static String say(int n) {
		if (n < 1)
			return "";
		if (n == 1) {
			return "1";
		} else {
			String str = say(n - 1);
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < str.length();) {
				char first = str.charAt(i);
				int num = 0;
				while (i < str.length() && str.charAt(i) == first) {
					num++;
					i++;
				}
				//System.out.println("" + num + first);
				res.append(num).append(first);
			}
			return res.toString();
		}
	}

}
