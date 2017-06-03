package com.hyt.ww;

/**
 * 工作类
 * 
 * @author wangwen
 *
 * 2017-6-1下午04:17:57
 */
public class Work {
	public double hour;
	public boolean finish;
	public State current;
	
	public Work() {
		current = new ForenoonState();
	}
	
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void setState(State state){
		current = state;
	}
	public void writeProgram(){
		current.writeProgram(this);
	}
}
