package com.hyt.prototype;

/**
 * 客户端(深克隆)
 * 
 * @author wangwen
 *
 * 2017-6-1上午08:47:24
 */
public class Client3 {

	public static void main(String[] args) {
		Resume3 a = new Resume3("大鸟");
		a.SetPersonalInfo("男", "29");
		a.SetWorkExperience("1998-2000", "xx公司");
		
		Resume3 b = (Resume3)a.clone();
		b.SetWorkExperience("1998-2006", "yy公司");
		
		Resume3 c = (Resume3)a.clone();
		c.SetWorkExperience("1998-2003", "zz公司");
		
		a.Display();
		b.Display();
		c.Display();
	}
	
}
