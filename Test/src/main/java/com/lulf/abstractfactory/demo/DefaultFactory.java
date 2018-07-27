package com.lulf.abstractfactory.demo;

import com.factory.test.Car;

//具体的业务逻辑层
public class DefaultFactory extends AbstractFactory{
	
	//什么都不传的话是默认工厂
	private AudiFactory DefaultFactory=new AudiFactory();

	@Override
	protected Car getCar() {
		return DefaultFactory.getCar();
	}

}
