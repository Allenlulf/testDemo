package com.niuke.jzoffer;
/*
 * 二维数组中的查找
 */
public class ewszzdcz {
	
	public static void main(String[] args) {
		int [][]aa={{1,2,3},{4,5,6},{7,8,9}};
		for (int[] is : aa) {
			for (int i : is) {
				if(i==9){
					System.out.println("111");
				}
			}
			
		}
		
	}
	 public boolean Find(int target, int [][] array) {
		 for (int[] is : array) {
				for (int i : is) {
					if(i==target){
						return true;
					}
				}
			}
		 return false;
	 }
}
