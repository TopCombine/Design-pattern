package com.hyt.cashSuper;

/**
 * 现金收费工厂类(简单工厂模式)
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:09:44
 */
public class CashFactory {

	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		if ("正常收费".equals(type)) {
			cs = new CashNormal();
		}else if("满300返100".equals(type)){
			cs = new CashReturn(300.00, 100.00);
		}else if("打8折".equals(type)){
			cs = new CashRebate(0.8);
		}
		return cs;
	}
	
}
