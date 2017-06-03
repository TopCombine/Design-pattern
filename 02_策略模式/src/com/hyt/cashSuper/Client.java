package com.hyt.cashSuper;

/**
 * 客户端(简单工厂模式)
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:14:33
 */
public class Client {

	static double total = 0.0d;
	
	public static void main(String[] args) {
		CashSuper csuper = CashFactory.createCashAccept("正常收费");
		double totalPrices = 0d;
		totalPrices = csuper.acceptCash(100.0);
		total = total + totalPrices;
		System.out.println("合计"+total);
	}
	
}
