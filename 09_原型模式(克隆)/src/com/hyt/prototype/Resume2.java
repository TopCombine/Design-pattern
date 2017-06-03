package com.hyt.prototype;

/**
 * 简历类(包含对象属性)
 * 
 * @author wangwen
 * 
 *         2017-6-1上午08:41:35
 */
public class Resume2 implements Cloneable {

	private String name;
	private String sex;
	private String age;

	private WorkExperience2 work;

	public Resume2(String name) {
		this.name = name;
		work = new WorkExperience2();
	}

	// 设置个人信息
	public void SetPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// 设置工作经历
	public void SetWorkExperience(String workDate, String company) {
		work.workDate = workDate;
	}

	// 显示
	public void Display() {
		System.out.println(name + " " + sex + " " + age);
		System.out.println("工作经历：" + work.workDate + " " + work.company);
	}

	// 克隆
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("MyObject can't clone");
		}
		return o;
	}

}
