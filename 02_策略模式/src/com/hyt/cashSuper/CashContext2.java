package com.hyt.cashSuper;

/**
 * 简单工厂与策略模式结合
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:32:48
 */
public class CashContext2 {

	private CashSuper cs;

	public CashContext2(String type) {
		if ("正常收费".equals(type)) {
			cs = new CashNormal();
		}else if("".equals(type)){
			cs = new CashReturn(300.0, 100.0);
		}else if("".equals(type)){
			cs = new CashRebate(0.8);
		}
	}
	
	public double GetResult(double money){
		return cs.acceptCash(money);
	}
	
	
}
