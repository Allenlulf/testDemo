package com.factory.test;

public class FactoryTest {
	public static void main(String[] args) {
		//工厂方法模式
		// 各个产品的生厂商，都拥有自己各自的工厂
		// 生产工艺，生成的高科技程度各不相同
		Factory factory1=new AudiFactory();
		System.out.println(factory1.getcar());
		//消费者只关心自己想要的那个生产工厂
		Factory factory2=new BenzFactory();
		System.out.println(factory2.getcar());
	}
}
