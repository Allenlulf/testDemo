package com.epoint.test;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//这块其实就是求解斐波那契数列
public class test4 {

	public static void main(String[] args) {
		System.out.println(JumpFloor(14));
	}

	public static int JumpFloor(int target) {
		if (target <= 2) {
			return target;
		}
		return JumpFloor(target - 2) + JumpFloor(target - 1);
	}
}
