package com.factory.test;

public class TestSimpleFactory {
	public static void main(String[] args) {
		// 这就是我们的消费者
		Car car = new SimpleFactory().getCar("Bmw");
		System.out.println(car.getName());
	}
}
