package com.hyt.proxy;

/**
 * 追求者
 * @author Administrator
 *
 */

public class Pursuit implements GiveGift {
	
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm) {
		super();
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println("送洋娃娃");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("送花");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("送巧克力");
	}

}
