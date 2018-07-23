package com.niuke.jzoffer;
/**
 * 跳台阶
 * @author lulf
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class TTJ {
    public int JumpFloor(int target) {
        if (target <= 2) {
			return target;
		}
		return JumpFloor(target - 2) + JumpFloor(target - 1);
    }
}
