package com.study;

public class Outer {
	private String name;
	
	class Inner{
		public void run(){
			System.out.println(name);
		}
	}
}
