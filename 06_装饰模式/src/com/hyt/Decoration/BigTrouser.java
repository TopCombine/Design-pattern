package com.hyt.Decoration;

/**
 * 垮裤(具体服饰类ConcreteDecorator)
 * 
 * @author wangwen
 *
 */
public class BigTrouser extends Finery{

	@Override
	public void show() {
		System.out.println("垮裤 ");
		super.show();
	}
	
}
