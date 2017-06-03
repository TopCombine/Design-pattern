package com.hyt.proxy;

/**
 * 代理类
 * @author Administrator
 *
 */

public class Proxy implements GiveGift{

	private Pursuit ps; //追求者

	public Proxy(SchoolGirl mm) {
		super();
		ps = new Pursuit(mm);
	}
	
	public void giveDolls(){
		ps.giveDolls();
	}
	
	public void giveFlowers(){
		ps.giveFlowers();		
	}
	
	public void giveChocolate(){
		ps.giveChocolate();
	}
	
	
}
