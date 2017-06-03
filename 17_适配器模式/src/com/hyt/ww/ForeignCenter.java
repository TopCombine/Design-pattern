package com.hyt.ww;

/**
 * 外籍中锋
 * @author wangwen
 *
 */
public class ForeignCenter extends Player{


	private String name; //

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("外籍中锋"+name+"进攻");
	}

	public void defense() {
		System.out.println("外籍中锋"+name+"防守");
	}
}
