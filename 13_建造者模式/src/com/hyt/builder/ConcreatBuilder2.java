package com.hyt.builder;

/**
 * 具体建造者类
 * 
 * @author wangwen
 *
 * 2017-6-1下午12:00:24
 */
public class ConcreatBuilder2 extends Builder{

	Product product = new Product();
	
	@Override
	public void builderPartA() {
		product.add("部件X");
	}

	@Override
	public void builderPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
