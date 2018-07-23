package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;

public class test13 {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int result = 0;
		if (s == "" || s.length() == 0) {
			return -1;
		}
		// 先把罗马数字跟阿拉伯数字对应关系放在一个map集合中
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] c = s.toCharArray();
		int len = c.length;
		result = map.get(s.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (map.get(c[i]) >= map.get(c[i + 1])) {
				result += map.get(c[i]);
			} else {
				result -= map.get(c[i]);
			}
		}
		return result;
	}
}
