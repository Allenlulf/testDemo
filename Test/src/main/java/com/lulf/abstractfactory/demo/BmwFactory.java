package com.lulf.abstractfactory.demo;

import com.factory.test.Bmw;
import com.factory.test.Car;

public class BmwFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
