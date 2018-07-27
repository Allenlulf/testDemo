package com.lulf.abstractfactory.demo;

public class testFactory {
	public static void main(String[] args) {
		DefaultFactory defaultFactory=new DefaultFactory();
		//默认工厂
		System.out.println(defaultFactory.getCar());
		//传值
		System.out.println(defaultFactory.getCar("Bmw"));
		
	}

}
