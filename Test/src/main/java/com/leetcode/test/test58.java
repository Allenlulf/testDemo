package com.leetcode.test;

public class test58 {
	public static void main(String[] args) {
		
	}

	public int lengthOfLastWord(String s) {
		String news=s.replaceAll(" ", ";");
		String [] ss=news.split(";");
		if(ss.length==0){
			return 0;
		}
		int num=ss[ss.length-1].length();
		return num;
	}
}
