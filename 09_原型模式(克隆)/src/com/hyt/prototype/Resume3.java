package com.hyt.prototype;


/**
 * 简历类
 * 
 * @author wangwen
 *
 * 2017-6-1上午09:39:50
 */
public class Resume3 implements Cloneable{

	private String name;
	private String sex;
	private String age;
	private WorkExperience3 work;
	
	public Resume3(String name) {
		this.name = name;
		work = new WorkExperience3();
	}
	
	public Resume3(WorkExperience3 work){
		this.work = (WorkExperience3) work.clone();
	}
	
	// 设置个人信息
	public void SetPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// 设置工作经历
	public void SetWorkExperience(String workDate, String company) {
		work.workDate = workDate;
		work.company = company;
	}

	// 显示
	public void Display() {
		System.out.println(name + " " + sex + " " + age);
		System.out.println("工作经历：" + work.workDate + " " + work.company);
	}
	
	// 克隆(调用私有的构造方法，让“工作经历”克隆完成，然后再给这个“简历”对象的相关字段赋值，最终返回一个深复制的简历对象)
	public Object clone() {
		Resume3 obj = new Resume3(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
}
