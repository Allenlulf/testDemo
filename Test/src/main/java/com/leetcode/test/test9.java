package com.leetcode.test;

public class test9 {
	public static void main(String[] args) {

	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else {

			int tmp = x;
			int result = 0;
			while (tmp != 0) {
				result = result * 10 + tmp % 10;
				tmp=tmp/10;
			}
			if(result==x){
				return true;
			}else{
				return false;
			}
		}

	}
}
