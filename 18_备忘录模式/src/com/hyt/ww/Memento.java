package com.hyt.ww;


/**
 * 备忘录 类
 * 
 * @author wangwen
 *
 * 2017-6-1下午07:27:09
 */
public class Memento {

	public String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
