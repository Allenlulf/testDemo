package com.leetcode.test;

public class test67 {

	public static void main(String[] args) {
		String a = "1";
		String b = "11";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int x = 0;
		int y = 0;
		int pre = 0;// 进位
		int sum = 0;// 存储进位和另两个位的和

		while (a.length() != b.length()) {// 将两个二进制的数位数补齐,在短的前面添0
			if (a.length() > b.length()) {
				b = "0" + b;
			} else {
				a = "0" + a;
			}
		}
		for (int i = a.length() - 1; i >= 0; i--) {
			x = a.charAt(i) - '0';
			y = b.charAt(i) - '0';
			sum = x + y + pre;// 从低位做加法
			if (sum >= 2) {
				pre = 1;// 进位
				sb.append(sum - 2);
			} else {
				pre = 0;
				sb.append(sum);
			}
		}
		if (pre == 1) {
			sb.append("1");
		}
		return sb.reverse().toString();// 翻转返回
	}
}
