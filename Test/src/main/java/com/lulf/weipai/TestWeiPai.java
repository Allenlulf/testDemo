package com.lulf.weipai;

public class TestWeiPai {
	public static void main(String[] args) {
		Dispatcher dispatcher=new Dispatcher(new TargetA());
		//看上去像是物流主管在干活
		// 事实上负责送快递的是具体的某个快递员
		// 典型的，干活是我的，功劳是你的
		dispatcher.doing();
	}

}
