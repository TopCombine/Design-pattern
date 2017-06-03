package com.hyt.ww;

/**
 * 下午工作状态
 * 
 * @author wangwen
 *
 * 2017-6-1下午04:19:45
 */
public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()<17) {
			System.out.println("当前时间："+w.getHour()+"点   下午状态还不错，继续努力");
		}else{
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
