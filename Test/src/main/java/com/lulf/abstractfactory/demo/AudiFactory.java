package com.lulf.abstractfactory.demo;

import com.factory.test.Audi;
import com.factory.test.Car;

public class AudiFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Audi();
	}

}
