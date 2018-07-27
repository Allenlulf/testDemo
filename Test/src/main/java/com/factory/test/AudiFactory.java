package com.factory.test;

public class AudiFactory implements Factory{

	@Override
	public Car getcar() {
		return new Audi();
	}

}
