package com.lulf.weipai;

public class Dispatcher implements IDelegate {

	IDelegate target;

	Dispatcher(IDelegate target) {
		this.target = target;
	};

	// 物流主管，虽然也继承执行方法，
	// 工作职责不一样
	public void doing() {
		this.target.doing();
	}
}
