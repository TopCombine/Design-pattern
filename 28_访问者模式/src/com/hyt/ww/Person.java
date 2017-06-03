package com.hyt.ww;

abstract class Person {
	protected String action;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	//得到结论或反应
	public abstract void getConclusion();
}
