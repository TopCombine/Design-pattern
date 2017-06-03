package com.hyt.ww;

/**
 * 伊拉克
 * 
 * @author wangwen
 *
 * 2017-6-3下午05:59:47
 */
public class Iraq extends Country{
	
	public Iraq(UnitedNations mediator) {
		super(mediator);
	}
	//声明
	public void declare(String message){
		mediator.declare(message, this);
	}
	//获得消息
	public void getMessage(String msg){
		System.out.println("伊拉克获得对方消息："+msg);
	}
}