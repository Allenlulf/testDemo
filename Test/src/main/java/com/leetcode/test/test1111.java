package com.leetcode.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 一个数组，里面有成对的数，还有一个单独的数，怎么快速的找出这个数
 * 
 * @author lulf
 */
public class test1111 {
	public static void main(String[] args) {
		String[] ret = new String[] { "a", "c", "a", "b", "c", "d", "b" };
		System.out.println(getvalue(ret));
	}

	public static String getvalue(String[] ret) {
		String result="";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < ret.length; i++) {
			if (map.get(ret[i]) == null) {
				map.put(ret[i], 1);
			} else {
				map.put(ret[i], map.get(ret[i]) + 1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result=entry.getKey();
			}
		}
		return result;
	}
}
