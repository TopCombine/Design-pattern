package com.hyt.Impl;

/**
 * 加法工厂
 * @author Administrator
 *
 */
public class AddFactory implements IFactory{

	@Override
	public Operation createOpera() {
		return new Add();
	}

}
