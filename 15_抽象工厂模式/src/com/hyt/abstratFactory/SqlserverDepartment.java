package com.hyt.abstratFactory;

/**
 * 访问sql Server的department
 * 
 * @author wangwen
 *
 * 2017-6-1下午02:51:24
 */
public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SQL Server中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在SQL Server中根据ID得到Department表增加一条记录");
		return null;
	}

}
