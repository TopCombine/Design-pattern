package com.hyt.ww;

/**
 * 联合国安全理事会
 * 
 * @author wangwen
 *
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

	private Usa usa;
	private Iraq iraq;
	
	public Usa getUsa() {
		return usa;
	}
	public void setUsa(Usa usa) {
		this.usa = usa;
	}
	public Iraq getIraq() {
		return iraq;
	}
	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

	//重写了声明方法，实现了两个对象间的通信
	@Override
	public void declare(String message, Country colleage) {
		if (colleage instanceof Usa) {
			iraq.getMessage(message);
		}else{
			usa.getMessage(message);
		}
	}

}
