package com.hyt.ww;

public class Client {

	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.attack();
		
		Player m = new Guards("麦格雷迪");
		m.attack();
		
		//通过翻译器告诉ForeignCenter
		Player y = new Translator("姚明");
		y.attack();
		y.defense();
		
	}
	
}
