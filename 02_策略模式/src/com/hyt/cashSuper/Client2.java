package com.hyt.cashSuper;

/**
 * 客户端(策略模式)
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:22:05
 */
public class Client2 {

	static double total = 0.0d;
	
	public static void main(String[] args) {
		CashContext cc = null;
		cc = new CashContext(new CashNormal());
		double totalPrices = 0d;
		totalPrices = cc.GetResult(100.0);
		total = total + totalPrices;
		System.out.println("合计"+total);
	}
	
}
