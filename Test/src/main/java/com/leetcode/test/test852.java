package com.leetcode.test;

public class test852 {
	public static void main(String[] args) {
		int[] A={0,1,2,1,0};
		System.out.println(peakIndexInMountainArray(A));
	}
	
	
	  public static int peakIndexInMountainArray(int[] A) {
		  int size=0;
		  for(int i=0;i<A.length;i++){
			  if(i>=1){
				  if(A[i-1]<A[i]){
					  size=i;
				  }else{
					  break;
				  }
			  }
		  }
		  return size;
	  }
}
