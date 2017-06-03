package com.hyt.ww;

/**
 * 睡眠状态
 * 
 * @author wangwen
 *
 * 2017-6-1下午04:17:34
 */
public class SleepingState extends State{
	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"点不行了，睡着了");
	}

}
