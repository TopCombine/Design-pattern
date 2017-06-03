package com.hyt.ww;

/**
 * 美国
 * 
 * @author wangwen
 *
 * 2017-6-3下午06:01:02
 */
public class Usa extends Country{

	public Usa(UnitedNations mediator) {
		super(mediator);
	}
	
	//声明
	public void declare(String message){
		mediator.declare(message, this);
	}
	
	//获得消息
	public void getMessage(String msg){
		System.out.println("美国获得对方消息："+msg);
	}
}
