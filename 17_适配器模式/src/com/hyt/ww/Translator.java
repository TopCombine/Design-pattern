package com.hyt.ww;

/**
 * 翻译者类
 * 
 * @author wangwen
 *
 * 2017-6-1下午06:07:44
 */
public class Translator extends Player{

	private ForeignCenter fc = new ForeignCenter();

	public Translator(String name) {
		super();
		fc.setName(name);
	}

	@Override
	public void attack() {
		fc.attack();
	}

	@Override
	public void defense() {
		fc.defense();
	}
	
	
	
	
}
