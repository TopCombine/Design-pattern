package com.hyt.Pattern;

import java.util.ArrayList;

/**
 * 前台秘书类
 * 
 * @author wangwen
 *
 * 2017-6-1下午01:33:11
 */
public class Secretary implements Subject{
	//同事列表
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	public String action;
	//通知
	public void Notify(){
		for (Observer stock : observers) {
			stock.update();
		}
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//减少
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	//前台状态
	@Override
	public String action() {
		return action;
	}
}
