package com.lulf.sjmsdemo;

import java.lang.reflect.Method;

import com.lulf.sjms.ZFZ;

public class MyDaiLi implements MyInvocationHandler {

	private ZFZ target;

	// 获取被代理人的对象
	@SuppressWarnings("rawtypes")
	public Object getInstance(ZFZ target) throws Exception {
		this.target = target;
		Class zz = target.getClass();
		System.out.println("被代理对象的class是 ：" + zz);
		return MyProxy.newProxyInstance(new MyClassLoader(), zz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是中介 CQ");
		method.invoke(target, args);
		return null;
	}
}
