package com.epoint.hj.test;

public class xuanze {
	public static void main(String[] args) {
		int [] arr=new int[]{4,2,7,3,1};
		
		int len=arr.length;
	
		
		for(int i=0;i<len-1;i++){
			int k=i;
			for(int j=k;j<len;j++){
				if(arr[j]<arr[k]){
					k=j;
				}
			}
			if(i!=k){
				int tmp=arr[k];
				arr[k]=arr[i];
				arr[i]=tmp;	
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
