package com.lulf.sjms;

import com.lulf.sjmsdemo.MyDaiLi;

public class Main {
	public static void main(String[] args) throws Throwable {
		//原理
		//1. 拿到被代理的对象引用,然后获取他的接口
		//2. JDK代理重新生成一个雷，同时实现我们给的代理对象所实现的接口
		//3. 把被代理对象的引用也拿到了
		//4. 重新动态生成一个class字节码
		//5. 最后编译
//		ZFZ obj=(ZFZ) new ZJ().getInstance(new lulf());
//		obj.zfz();
//		obj.zf();
		ZFZ obj=(ZFZ) new MyDaiLi().getInstance(new lulf());
		obj.zfz();
		obj.zf();
		
	}
}
