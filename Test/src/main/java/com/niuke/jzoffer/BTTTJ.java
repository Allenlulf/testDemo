package com.niuke.jzoffer;

/**
 * 变态跳台阶
 * 
 * @author lulf 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class BTTTJ {
	public static void main(String[] args) {
		int number = 5;
		System.out.println(JumpFloorII(number));
	}

	public static int JumpFloorII(int target) {
		int m=0,i;
        if(target<0)m=0;
           else if(target==0)m=1;
                  else
                      for(i=target-1;i>=0;i--)
                           m+=JumpFloorII(i);
         return m;
	}
}
