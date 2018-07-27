package com.factory.test;

public class BenzFactory implements Factory{

	@Override
	public Car getcar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
