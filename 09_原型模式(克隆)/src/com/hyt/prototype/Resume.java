package com.hyt.prototype;
/**
 * 简历类
 * 
 * @author Administrator
 *
 */
public class Resume {
	
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	/**
	 * 设置名称
	 * @param name
	 */
	public Resume(String name) {
		this.name = name;
	}
	
	/**
	 * 设置个人信息
	 * @param sex
	 * @param age
	 */
	public void setPersonInfo(String sex,String age){
		this.sex = sex;
		this.age = age;
	}
	
	/**
	 * 设置工作经历
	 * @param timeArea
	 * @param company
	 */
	public void setWorkExperience(String timeArea,String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	/**
	 * 显示 
	 */
	public void display(){
		System.out.println(name+sex+age);
		System.out.println(timeArea+company);
	}
	
}
