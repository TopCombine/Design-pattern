package com.hyt.cashSuper;

/**
 * 返利收费子类
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:06:51
 */
public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0d;  //超过多少返利
	private double moneyReturn = 0.0d;     //返利金额
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}



	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
