package com.hyt.ww;

/**
 * 人力资源部与财务部类  树叶节点
 * 
 * @author wangwen
 *
 * 2017-6-1下午07:57:27
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		System.out.println(depth + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name+"员工招聘培训管理");
	}

}
