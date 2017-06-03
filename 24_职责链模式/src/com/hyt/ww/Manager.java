package com.hyt.ww;

/**
 * 管理者
 * @author wangwen
 *
 */

public abstract class Manager {

	protected String name;
	//管理者的上级
	protected Manager superior;
	
	public Manager(String name) {
		super();
		this.name = name;
	}
	
	//设置管理者的上级
	public void setSuperior(Manager superior){
		this.superior = superior;
	}
	
	public abstract void requestApplication(Request request);
	
}
