package com.hyt.builder;

/**
 * 指挥者类
 * 
 * @author wangwen
 *
 */

public class Director {
	
	public Director(Builder builder) {
		builder.builderPartA();
		builder.builderPartB();
	}
	
	public Director() {
	}
	
}
