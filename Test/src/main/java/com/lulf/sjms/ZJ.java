package com.lulf.sjms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZJ implements InvocationHandler{
	private ZFZ target;
	
	//获取被代理人的对象
	@SuppressWarnings("rawtypes")
	public Object getInstance(ZFZ target){
		this.target=target;
		Class zz=target.getClass();
		return Proxy.newProxyInstance(zz.getClassLoader(), zz.getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是中介 CQ");
		method.invoke(target, args);
		return null;
	}
}
