package com.llf.model;

//冲泡饮料
public abstract class Bevegrage {
	
	//流程步骤不允许被重写
	public final void create(){
		//1 烧开水
		builWater();
		//2 准备杯子及原材料
		pourInCup();
		//3 冲泡
		brew();
		//4 添加辅料
		addCoundiments();		
	}

	public abstract void addCoundiments();

	public void brew() {
		System.out.println("冲泡");		
	}

	public abstract void pourInCup();

	public void builWater() {
		System.out.println("烧热水");	
	}
}
