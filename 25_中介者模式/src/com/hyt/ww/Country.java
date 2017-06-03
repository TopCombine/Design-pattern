package com.hyt.ww;

/**
 * 国家类
 * 
 * @author wangwen
 *
 */

public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
