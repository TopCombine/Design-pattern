package com.hyt.builder;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1上午11:41:24
 */
public class Client {
	public static void main(String[] args) {
		
		Builder b1 = new ConcreatBuilder1();
		Builder b2 = new ConcreatBuilder2();
		
		new Director(b1);
		//指挥者用ConcreteBuilder1的方法来建造产品
		Product p1 = b1.getResult();
		p1.show();
		
		new Director(b2);
		//指挥者用ConcreteBuilder2的方法来建造产品
		Product p2 = b2.getResult();
		p2.show();
	}
}
