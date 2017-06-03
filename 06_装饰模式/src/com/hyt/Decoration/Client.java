package com.hyt.Decoration;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-5-27上午10:22:59
 */
public class Client {
	public static void main(String[] args) {
		Person p = new Person("小菜");
		
		System.out.println("第一种装扮");
		Finery t = new TShirts();
		Finery b = new BigTrouser();
		Finery s = new Sneakers();
		t.show();
		b.show();
		s.show();
		
		System.out.println("第二种装扮");
		Finery s2 = new Suit();
		Finery t2 = new Tie();
		Finery ls = new LeatherShoes();
		s2.show();
		t2.show();
		ls.show();
		
		p.show();
	}
}
