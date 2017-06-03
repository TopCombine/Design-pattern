package com.hyt.ww;

/**
 * 手机品牌类
 * 
 * @author wangwen
 *
 * 2017-6-3上午10:19:24
 */
public abstract class HandsetBrand {

	protected HandsetSoft soft;
	
	//设置手机软件
	public void setHandsetSoft(HandsetSoft soft){
		this.soft = soft;
	}
	
	//运行
	public abstract void run();
	
}
