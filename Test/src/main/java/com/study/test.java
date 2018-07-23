package com.study;

public class test {
	public static void main(String[] args) {
		demo de=new demo();
		de.run();
	}
}
class demo implements Runnable{
	@Override
	public void run() {
		System.out.println("11111");
	}
}
