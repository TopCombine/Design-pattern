package com.hyt.ww;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("失败 ");

	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println("失败");
	}

}
