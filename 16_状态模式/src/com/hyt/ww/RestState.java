package com.hyt.ww;

/**
 * 下班休息状态
 * 
 * @author wangwen
 *
 */
public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"点下班回家了");
	}

}
