package com.hyt.prototype;

/**
 * 客户端(简单的克隆模式)
 * 
 * @author wangwen
 *
 * 2017-6-1上午08:33:37
 */
public class Client {

	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.setPersonInfo("男", "20");
		a.setWorkExperience("2015-2016", "百度");
		
		a.display();
		
		//复制
		Resume b = a;
		Resume c = a;
		
		b.display();
		c.display();
	}
	
}
