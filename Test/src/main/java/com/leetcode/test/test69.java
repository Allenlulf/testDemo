package com.leetcode.test;

public class test69 {

	public static void main(String[] args) {
		System.out.println(mySqrt(100));
	}

	public static int mySqrt(int x) {
		if (x <= 1) {
			return x;
		}
		int begin = 1;
		int end = x;
		int rex = 0;
		while (begin <= end) {
			rex=begin+(end-begin)/2;
			if(rex == x/rex){
				return rex;	
			}else{
				if(rex < x/rex){
					begin=rex+1;
				}else{
					end=rex-1;
				}
			}
		}
		return end;
	}
}
