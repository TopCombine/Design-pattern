package com.hyt.ww;


/**
 * 懒汉式单例模式
 * @author wangwen
 *
 */
public class Singleton {

	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		//先判断实例是否存在，不存在再加锁处理
		if (singleton==null) {
			synchronized (singleton) {
				singleton = new Singleton();
			}
		}		
		return singleton;
	}
	
}
