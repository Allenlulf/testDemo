package com.niuke.jzoffer;

/**
 * 斐波那契数列
 * 
 * @author lulf 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39 1 1 2 3 5 8 13
 */
public class FBNQSL {
	public static void main(String[] args) {
		System.out.println(getResult(5));
	}

	public static int getResult(int n) {
		if(n<=0){
            return 0;
        }
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return getResult(n - 1) + getResult(n - 2);
		}
	}
}
