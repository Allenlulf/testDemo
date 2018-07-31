package com.llf.yuanxing;

public class cloneTest {
	public static void main(String[] args) {
		// 有一个现成的对象，这个对象中已经有设置好的值
		// 当我这边需要新建一个对象并且要给新建的对象赋值，而且赋值内容要跟之前的一模一样
		ConcretePrototype cp = new ConcretePrototype();
		cp.setAge(18);
		try {
			ConcretePrototype copy = (ConcretePrototype) cp.clone();
			System.out.println(cp == copy);
			System.out.println(cp.list == copy.list);
			System.out.println(copy.getAge());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
