package com.leetcode.test;

public class test27 {
	public static void main(String[] args) {
		int[] num = new int[] { 1};
		System.out.println(removeElement(num,1));
	}

	public static int removeElement(int[] nums, int val) {
		int [] num_bak=nums;
		if(num_bak == null){
			return 0;
		}
		int size=0;
		for(int i=0;i<num_bak.length;i++){
			if(num_bak[i]!=val){
				nums[size]=num_bak[i];
				size++;
			}
		}
		return size;
	}
}
