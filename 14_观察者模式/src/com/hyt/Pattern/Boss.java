package com.hyt.Pattern;

import java.util.ArrayList;


/**
 * 老板类
 * 
 * @author wangwen
 *
 * 2017-6-1下午01:46:18
 */
public class Boss implements Subject{
	//观察者(同事列表)
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	public String action;
	//通知
	public void Notify(){
		for (Observer stock : observers) {
			stock.update();
		}
	}
	//增加
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//减少
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	//老板状态
	@Override
	public String action() {
		return action;
	}
}
