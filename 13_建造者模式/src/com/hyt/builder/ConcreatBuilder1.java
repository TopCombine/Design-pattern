package com.hyt.builder;

/**
 * 具体建造者类
 * 
 * @author wangwen
 *
 * 2017-6-1上午11:59:31
 */
public class ConcreatBuilder1 extends Builder{

	Product product = new Product();
	
	@Override
	public void builderPartA() {
		product.add("部件A");
	}

	@Override
	public void builderPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
