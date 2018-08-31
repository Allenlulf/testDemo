package com.epoint.hj.test;

public class maopao {
	public static void main(String[] args) {
		//从小到大排序
		int [] arr=new int[]{4,2,7,9,1};
		int len=arr.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					int value=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=value;	
				}
			}
		}
	}
}
