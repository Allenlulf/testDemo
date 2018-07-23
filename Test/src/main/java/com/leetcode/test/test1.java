package com.leetcode.test;

public class test1 {
	
	public static void main(String[] args) {
		int[] a=new int[]{2,7,11,15};
		int [] ss=twoSum(a,9);
		for (int i : ss) {
			System.out.println(i);
		}
	}
	
	
	 public static int[] twoSum(int[] nums, int target) {
		 int [] result=null;
		 for(int i=0;i<nums.length-1;i++){
			 for(int j=i+1;j<nums.length;j++){
				 if((nums[i]+nums[j])==target){
					 result=new int[]{i,j};
				 }
			 }
		 }
	      return result;  
	  }
}
