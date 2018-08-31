package com.jvm.test1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class testExecutor {
	public static void main(String[] args) {
		Executor e=Executors.newSingleThreadExecutor();
		e.execute(new Runnable() {
			@Override
			public void run() {
				// ÒµÎñ´úÂë
			}
		});
		
	}

}
