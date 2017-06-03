package com.hyt.paper;

/**
 * 试卷类
 * 
 * @author wangwen
 *
 */
public abstract class TestPaper {
	public void TestQuestion1(){
		System.out.println("试题1："+result1());
	}
	public abstract String result1();
	
	public void TestQuestion2(){
		System.out.println("试题2："+result2());
	}
	public abstract String result2();
	
	public void TestQuestion3(){
		System.out.println("试题3："+result3());
	}
	public abstract String result3();
}
