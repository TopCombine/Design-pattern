package com.hyt.abstratFactory;

/**
 * 用于访问Access的Department
 * 
 * @author wangwen
 *
 * 2017-6-1下午02:53:05
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在Access中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在Access中根据ID得到Department表增加一条记录");
		return null;
	}

}
