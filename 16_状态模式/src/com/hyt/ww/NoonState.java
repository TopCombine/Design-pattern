package com.hyt.ww;

/**
 * 中午工作状态
 * 
 * @author wangwen
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<13) {
			System.out.println("当前时间："+w.getHour()+"点 饿了，午饭：犯困，无休");
		}else{
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
