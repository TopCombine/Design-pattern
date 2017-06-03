package com.hyt.prototype;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1上午08:47:24
 */
public class Client2 {

	public static void main(String[] args) {
		Resume2 a = new Resume2("大鸟");
		a.SetPersonalInfo("男", "29");
		a.SetWorkExperience("1998-2000", "xx公司");
		
		Resume2 b = (Resume2)a.clone();
		b.SetWorkExperience("1998-2006", "xx公司");
		
		Resume2 c = (Resume2)a.clone();
		c.SetWorkExperience("1998-2003", "xx公司");
		
		a.Display();
		b.Display();
		c.Display();
	}
	
}
