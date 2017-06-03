package com.hyt.cashSuper;

/**
 * 打折收费子类
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:05:40
 */
public class CashRebate extends CashSuper {
	
	private double moneyRebate = 1d;
	
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}


	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
