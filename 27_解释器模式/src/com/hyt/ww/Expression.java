package com.hyt.ww;

/**
 * 表达式类
 * 
 * @author wangwen
 *
 * 2017-6-3下午07:20:25
 */
abstract class Expression {

	//解释器
	public void interpret(PlayContext context){
		if (context.getText().length() == 0) {
			return;
		}else{
			String playKey = context.getText().substring(0,1);
			context.text = context.getText().substring(2);
			double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
			context.text = context.getText().substring(context.getText().indexOf(" ")+1);
			
			excute(playKey, playValue);
		}
	}
	
	
	//执行
	public abstract void excute(String key,double value);
}
