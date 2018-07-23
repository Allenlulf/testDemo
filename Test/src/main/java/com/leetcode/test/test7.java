
package com.leetcode.test;

public class test7 {

	public static void main(String[] args) {
		// int value=(int) Math.pow(-2, 31);
		// System.out.println(value);
		System.out.println(reverse(123));

	}

	public static int reverse(int x) {
		    long tmp = x;
	        // 防止结果溢出
	        long result = 0;
	        while (tmp != 0) {
	            result = result * 10 + tmp % 10;
	            tmp = tmp / 10;
	        }
	        // 溢出判断 
	        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
	            result = 0;
	        }
	        return (int) result;

	}
}
