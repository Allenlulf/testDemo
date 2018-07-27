package com.factory.test;

public class BmwFactory implements Factory{

	@Override
	public Car getcar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
