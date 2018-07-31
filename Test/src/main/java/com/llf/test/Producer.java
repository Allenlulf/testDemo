package com.llf.test;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable{
	
	BlockingDeque<String> queue;
	
	public Producer(BlockingDeque<String> queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		try {
			String temp="A Product,生产线程为"+Thread.currentThread().getName();
			System.out.println("I have made a product :"+Thread.currentThread().getName());
			queue.put(temp);	
		} catch (Exception e) {
			e.getStackTrace().toString();	
		}	
	}
}
