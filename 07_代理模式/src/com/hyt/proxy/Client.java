package com.hyt.proxy;

public class Client {
	
	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl("美少女战士");
		
		Proxy daili = new Proxy(mm);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
		
	}

}
