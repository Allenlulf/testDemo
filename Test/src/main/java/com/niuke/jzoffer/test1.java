package com.niuke.jzoffer;

// 调整数组顺序是奇数位于偶数前面
public class test1 {

	public static void main(String[] args) {
		int []arr={2,1,3,5,6,8,7};
		System.out.println("排序前数组为：");
		for (int i : arr) {
			System.out.print(i+" ");
		}
//	　　　　for(int i=0;i<arr.length-1;i++){//外层循环控制排序趟数
//	　　　　　　for(int j=0;j<arr.length-1-i;j++){//内层循环控制每一趟排序多少次
//	　　　　　　　　if(arr[j]>arr[j+1]){
//	　　　　　　　　　　int temp=arr[j];
//	　　　　　　　　　　arr[j]=arr[j+1];
//	　　　　　　　　　　arr[j+1]=temp;
//	　　　　　　　　}
//	　　　　　　}
//	　　　　} 
//	　　　　System.out.println();
//	　　　　System.out.println("排序后的数组为：");
//	 　　　　for(int num:arr){
//	 　　　　　　System.out.print(num+" ");
//	 　　　　} 
	}

	public void reOrderArray(int[] array) {
		for (int i : array) {
			if (i % 2 == 0) {

			}
		}

	}
}
