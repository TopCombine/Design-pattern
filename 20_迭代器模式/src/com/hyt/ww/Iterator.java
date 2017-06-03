package com.hyt.ww;


/**
 * Iterator迭代器抽象类
 * 
 * @author wangwen
 *
 * 2017-6-1下午08:17:54
 */
abstract class Iterator {

	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();
	
}
