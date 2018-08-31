package com.danli.test;

public class test {
	public static void main(String[] args) {
		danli d1=danli.INSTANCE;
		danli d2=danli.INSTANCE;
		System.out.println(d1.getString());
		d1.test();
		d1.setString("one");
		System.out.println(d1==d2);
		System.out.println(d2.getString());
	}
}
