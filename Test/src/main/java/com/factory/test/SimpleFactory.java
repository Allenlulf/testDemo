package com.factory.test;
//对这个工厂而言
//这个工厂可以分管了所有的车型
public class SimpleFactory {
	
	//实现了统一管理，专业化管理
	//如果没有工厂模式，小作坊，没有执行标准化
	public Car getCar(String name){
		if("Bmw".equals(name)){
			return new Bmw();
		}else if("Benz".equals(name)){
			return new Benz();
		}else if("Audi".equals(name)){
			return new Audi();
		}else{
			System.out.println("无此车型");
			return null;
		}
	}
}
