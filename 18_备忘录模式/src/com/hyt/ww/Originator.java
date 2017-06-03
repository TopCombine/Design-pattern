package com.hyt.ww;

/**
 * 发起人 类
 * @author wangwen
 *
 * 2017-6-1下午07:23:29
 */
public class Originator {

	String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void setMemento(Memento memento){
		state = memento.state;
	}
	
	public void show(){
		System.out.println("State="+state);
	}
	
	
}
