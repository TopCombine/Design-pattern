package com.hyt.prototype;

/**
 * 工作经历
 * 
 * @author wangwen
 *
 * 2017-6-1上午09:38:33
 */
public class WorkExperience3 implements Cloneable{
	String workDate;
	String company;
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
