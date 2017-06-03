package com.hyt.ww;

/**
 * 成功
 * 
 * @author wangwen
 *
 * 2017-6-3下午07:59:00
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println("背后多半有一个不成功的男人");
	}

}
