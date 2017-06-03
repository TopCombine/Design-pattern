package com.hyt.ww;

/**
 * 抽象命令类
 * 
 * @author wangwen
 *
 * 2017-6-3上午11:04:00
 */
public abstract class Command {
	
	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {  //只需要确定"烤肉串者"是谁
		super();
		this.receiver = receiver;
	}
	
	public abstract void excuteCommand();
	
}
