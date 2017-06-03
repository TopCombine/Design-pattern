package com.hyt.Pattern;

/**
 * 	抽象的观察者
 * 
 * @author wangwen
 *
 */

public abstract class Observer {
	
	protected String name;
	protected Subject sub;
	
	public Observer(String name, Subject sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void update();
	
}
