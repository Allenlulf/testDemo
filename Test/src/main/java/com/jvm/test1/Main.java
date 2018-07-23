package com.jvm.test1;

/**
 * 计算每年投入固定本金利息计算最终本息利率
 * @author lulf
 */
public class Main {

	private static double result = 0;

	public static void main(String[] args) {
		double bj = 60000;
		double lx = 1.055;
		int year = 30;
		System.out.println(getMoney(bj, lx, year));
	}

	public static double getMoney(double bj, double lx, int year) {
		for (int i = 1; i <= year; i++) {
			result += bj * Math.pow(lx, i);
		}
		return result;
	}
}
