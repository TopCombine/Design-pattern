package com.hyt.ww;

/**
 * 音符类
 * 
 * @author wangwen
 *
 * 2017-6-3下午07:21:47
 */
public class Note extends Expression {

	@Override
	public void excute(String key, double value) {
		String note = "";
		if (key.equals("C")) {
			note = "1";
		}else if(key.equals("D")){
			note = "2";
		}else if(key.equals("E")){
			note = "3";
		}else if(key.equals("F")){
			note = "4";
		}else if(key.equals("G")){
			note = "5";
		}else if(key.equals("A")){
			note = "6";
		}else if(key.equals("B")){
			note = "7";
		}
		System.out.println(note);
	}

}
