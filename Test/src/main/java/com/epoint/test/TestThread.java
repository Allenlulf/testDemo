package com.epoint.test;

public class TestThread {
	public static void main(String[] args) throws Exception {
		TestThreaddemo t1 = new TestThreaddemo("t1");
		TestThreaddemo t2 = new TestThreaddemo("t2");
	    t1.start();
	    t2.start();
	}
}
class TestThreaddemo extends Thread {
	TestThreaddemo(String name){
		super(name);
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为5时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 5) {
                Thread.yield();
            }
        }
	}
}
