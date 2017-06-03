package com.hyt.builder;

/**
 * 抽象建造者类
 *
 * @author wangwen
 *
 */

public abstract class Builder {

	public abstract void builderPartA();
	
	public abstract void builderPartB();
	
	public abstract Product getResult();
	
}
