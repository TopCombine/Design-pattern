package com.hyt.facade;

/**
 * 外观模式
 * 
 * @author wangwen
 *
 */

public class Facade {
	SubSystem1 s1;
	SubSystem2 s2;
	SubSystem3 s3;
	
	public Facade() {
		s1 = new SubSystem1();
		s2 = new SubSystem2();
		s3 = new SubSystem3();
	}
	
	public void methodA(){
		s1.method1();
		s3.method3();
	}
	
	public void methodB(){
		s2.method2();
	}
	
	
}
