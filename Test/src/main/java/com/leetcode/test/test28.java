package com.leetcode.test;

import org.apache.commons.lang.StringUtils;

public class test28 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "ll";
		System.out.println(strStr(str1, str2));
	}

	public static int strStr(String haystack, String needle) {
		if (needle == null || needle == "") {
			return 0;
		}
		int size = needle.length();
		if (haystack.indexOf(needle) != -1) {
			for (int i = 0; i < haystack.length() - size + 1; i++) {
				if (needle.equals(haystack.substring(i, i + size))) {
					return i;
				}
			}
		} else {
			return -1;
		}
		return 0;
	}
}
