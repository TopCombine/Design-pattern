package com.hyt.Decoration;


/**
 * 客户端2
 * 
 * @author wangwen
 *
 * 2017-5-31下午05:40:09
 */
public class Client2 {

	public static void main(String[] args) {
		Person p = new Person("小菜");
		
		System.out.println("第一种装扮");
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		pqx.Decorate(p);
		kk.Decorate(pqx);
		dtx.Decorate(kk);
		dtx.show();
		
		System.out.println("第二种装扮");
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.Decorate(p);
		ld.Decorate(px);
		xz.Decorate(ld);
		xz.show();
	}
	
}
