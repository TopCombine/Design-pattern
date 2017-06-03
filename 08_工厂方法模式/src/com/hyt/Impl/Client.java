package com.hyt.Impl;

public class Client {
	public static void main(String[] args) {
		IFactory addFactory = new AddFactory();
		Operation add = addFactory.createOpera();
		add.getResult(3, 4);
	}
}
