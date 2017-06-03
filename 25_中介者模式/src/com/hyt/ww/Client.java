package com.hyt.ww;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-3下午05:58:45
 */
public class Client {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
		
		Usa usa = new Usa(unsc);
		Iraq iraq = new Iraq(unsc);
		
		unsc.setUsa(usa);
		unsc.setIraq(iraq);
		
		usa.declare("不准研制核武器，否则要发动战争");
		iraq.declare("我们没有核武器，也不怕被侵略");
	}
}
