package com.leetcode.test;

//ÄûÃÊË®ÕÒÁã
public class test860 {

	public static void main(String[] args) {

	}

	public boolean lemonadeChange(int[] bills) {
		int five = 0, ten = 0;
		for (int i : bills) {
			if (i == 5) {
				five++;
			} else if (i == 10) {
				if (five > 0) {
					five--;
					ten++;
				} else {
					// ÎŞ·¨ÕÒÁã
					return false;
				}
			} else {
				if(five>0){
					if(ten>0){
						ten--;
						five--;
					}else{
						if(five>=3){
							five--;
							five--;
							five--;
						}else{
							return false;
						}
					}
				}else{
					return false;
				}
			}
		}
		return true;
	}
}
