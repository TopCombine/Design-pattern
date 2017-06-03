package com.hyt.cashSuper;

/**
 * 正常收费子类
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:04:59
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
