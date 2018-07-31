package com.llf.test;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{
     BlockingDeque<String> queue;
	
	public Consumer(BlockingDeque<String> queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {
		try {
			String temp=queue.take();
			System.out.println(temp);
		} catch (Exception e) {
			e.getStackTrace().toString();
		}	
	}
}
