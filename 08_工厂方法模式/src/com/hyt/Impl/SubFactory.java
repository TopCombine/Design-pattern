package com.hyt.Impl;

/**
 * 减法工厂
 * @author Administrator
 *
 */
public class SubFactory implements IFactory{

	@Override
	public Operation createOpera() {
		// TODO Auto-generated method stub
		return new Sub();
	}

}
