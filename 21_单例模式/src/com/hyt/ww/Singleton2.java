package com.hyt.ww;

/**
 * 饿汉式单例
 * @author wangwen
 *
 */

public class Singleton2 {
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2(){
		
	}
	
	public static Singleton2 getInstance(){
			
		if (singleton==null) {
			singleton = new Singleton2();
		}
		return singleton;
	}
}
