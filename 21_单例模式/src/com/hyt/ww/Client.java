package com.hyt.ww;


public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1==s2) {
			System.out.println("两个对象是相同的实例");
		}
		
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		
		if (s3==s4) {
			System.out.println("两个对象是相同的实例");
		}
	}
	
}
