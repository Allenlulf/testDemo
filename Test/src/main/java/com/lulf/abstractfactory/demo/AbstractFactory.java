package com.lulf.abstractfactory.demo;

import com.factory.test.Car;

public abstract class AbstractFactory {

	protected abstract Car getCar();

	//动态配置的过程
	public Car getCar(String name) {
		if ("Bmw".equals(name)) {
			return new BmwFactory().getCar();
		} else if ("Benz".equals(name)) {
			return new BenzFactory().getCar();
		} else if ("Audi".equals(name)) {
			return new AudiFactory().getCar();
		} else {
			System.out.println("无此车型");
			return null;
		}
	}

}
