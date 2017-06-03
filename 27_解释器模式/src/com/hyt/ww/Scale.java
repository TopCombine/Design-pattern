package com.hyt.ww;

/**
 * 音符类
 * 
 * @author wangwen
 *
 * 2017-6-3下午07:29:42
 */
public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		String scale = "";
		if (value == 1.0d) {
			scale = "低音";
		}else if(value == 2.0d){
			scale = "中音";
		}else if(value == 3.0d){
			scale = "高音";
		}
		System.out.println(scale);
	}

}
