package com.hyt.abstratFactory;

/**
 * IDepartment接口，用于客户端访问，解除与具体数据库访问的耦合
 * 
 * @author wangwen
 *
 * 2017-6-1下午02:49:46
 */
public interface IDepartment {

	void insert(Department department);
	
	Department getDepartment(int id);
	
}
