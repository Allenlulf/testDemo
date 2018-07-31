package com.llf.test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class TestBlockqueue {
	public static void main(String[] args) {
		//注意如果不设置值的话就是Integer.MAX_VALUE
		BlockingDeque<String> blockingDeque=new LinkedBlockingDeque<String>(2);
		Consumer consumer=new Consumer(blockingDeque);
		Producer producer=new Producer(blockingDeque);
		for(int i=0;i<5;i++){
			new Thread(producer, "Producer "+(i+1)).start();
			new Thread(consumer, "consumer "+(i+1)).start();
		}	
	}
}
