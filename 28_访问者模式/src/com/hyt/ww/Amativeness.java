package com.hyt.ww;

/**
 * 恋爱
 * 
 * @author wangwen
 *
 * 2017-6-3下午08:11:01
 */
public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("恋爱");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println("恋爱");
	}

}
