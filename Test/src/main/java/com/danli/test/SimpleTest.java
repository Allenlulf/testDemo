package com.danli.test;

// 懒汉式写法(静态内部类)
// 既解决了安全性问题，又解决了性能问题
public class SimpleTest {
	// 1 首先声明了一个静态内部类
	// private 私有属性保证别人不能修改
	// static 保证全局唯一
	private static class LazyHolder{
		// final 为了防止内部误操作
		private static final SimpleTest INSTANCE=new SimpleTest();
	}
	
	// 2 默认构造方法私有化
	private SimpleTest(){}
	
	// 3 同样提供静态方法获取实例
	// final 防止别人来覆盖
	public static final SimpleTest getInstance(){
		return LazyHolder.INSTANCE;
	}
}
