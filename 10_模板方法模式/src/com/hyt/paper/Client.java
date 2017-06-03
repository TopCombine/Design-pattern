package com.hyt.paper;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1上午10:15:43
 */
public class Client {
	public static void main(String[] args) {
		TestPaper paperA = new PaperA();
		paperA.TestQuestion1();
		paperA.TestQuestion2();
		paperA.TestQuestion3();
		
		TestPaper paperB = new PaperB();
		paperB.TestQuestion1();
		paperB.TestQuestion2();
		paperB.TestQuestion3();
	}
}
