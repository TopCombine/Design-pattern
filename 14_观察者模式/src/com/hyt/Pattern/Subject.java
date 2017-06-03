package com.hyt.Pattern;

/**
 * 通知者接口(通知者可能是老板也可能是前台...)
 * 
 * @author wangwen
 *
 * 2017-6-1下午01:44:36
 */
public interface Subject {
	
	void attach(Observer observer);
	void detach(Observer observer);
	void Notify();
	
	//状态
	public String action();
	
}
