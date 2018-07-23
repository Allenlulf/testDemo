package com.llf.Refactor.test1;

public class testsynchronized {
	public int inc = 0;
	public synchronized void increase() {
		inc++;
	}
	public static void main(String[] args) {
		final testsynchronized test = new testsynchronized();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 1000; j++)
						test.increase();
				};
			}.start();
		}
		while (Thread.activeCount() > 1) // 保证前面的线程都执行完
			Thread.yield();
		System.out.println(test.inc);
	}
}
