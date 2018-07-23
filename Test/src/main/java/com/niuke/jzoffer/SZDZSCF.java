package com.niuke.jzoffer;
/**
 * 数值的整数此方
 * @author lulf
 *
 */
public class SZDZSCF {

	public static void main(String[] args) {
		System.out.println(Power(2, -3));
	}

	public static double Power(double base, int exponent) {
		Double result;
		if (exponent == 0) {
			result= (double) 1;
		} else if (exponent == 1) {
			result = base;
		} else if(exponent<0){
			result = base;
			exponent=Math.abs(exponent);
			for (int i = 1; i < exponent; i++) {
				result = base * result;
			}
			result=1/result;
		}
		else {
			result = base;
			for (int i = 1; i < exponent; i++) {
				result = base * result;
			}
		}
		return result;
	}
}
