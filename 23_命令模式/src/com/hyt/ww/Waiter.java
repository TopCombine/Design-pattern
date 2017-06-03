package com.hyt.ww;

/**
 * 服务员
 * 
 * @author wangwen
 *
 */

public class Waiter {
	private Command	command;
	
	/**
	 * 设置订单
	 * @param command
	 */
	public void setOrder(Command command){
		this.command = command;
	}
	
	/**
	 * 通知执行
	 */
	public void notifyExcute(){
		command.excuteCommand();
	}
}
