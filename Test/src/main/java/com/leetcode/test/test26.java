package com.leetcode.test;

public class test26 {

	public static void main(String[] args) {
		int[] num = new int[] { 0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(num));

	}

	public static int removeDuplicates(int[] nums) {
		int [] num2=nums;
		if (num2 == null) {
			return 0;
		}
		if (num2.length == 0 || num2.length == 1) {
			return num2.length;
		}
		int size=1;
		for(int s=1;s<num2.length;s++){
			if(num2[s-1]!=num2[s]){
				nums[size]=num2[s];
				size++;
			}
		}
		return size;
	}
}
