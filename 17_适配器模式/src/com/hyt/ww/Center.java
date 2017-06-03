package com.hyt.ww;

public class Center extends Player{

	public Center(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("中锋"+name+"进攻");
	}

	@Override
	public void defense() {
		System.out.println("中锋"+name+"防守");
	}

}
