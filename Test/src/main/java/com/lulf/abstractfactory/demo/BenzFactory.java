package com.lulf.abstractfactory.demo;

import com.factory.test.Benz;
import com.factory.test.Car;

public class BenzFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
