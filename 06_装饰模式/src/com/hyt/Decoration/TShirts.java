package com.hyt.Decoration;

/**
 * 大T恤(具体服饰类ConcreteDecorator)
 * 
 * @author wangwen
 *
 */
public class TShirts extends Finery{

	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}

}
