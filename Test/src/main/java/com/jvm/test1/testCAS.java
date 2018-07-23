package com.jvm.test1;

public class testCAS {
public static void main(String[] args) {
	//s1和s2字符串创建在运行常量池中，而不是堆内存开辟区域，
	//有一块Stringtable存储类似于hashset，
	//无序不可重复，所以s1和s2指向同一个常量池引用
	String s1="abc";
	String s2="abc";
	//s3创建了实例对象，开辟在堆内存中
	String s3=new String("abc");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	// intern 方法把s3 运行时常量
	System.out.println(s1==s3.intern());
	}
}
