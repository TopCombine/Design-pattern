package com.hyt.abstratFactory;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1下午03:08:31
 */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		Department dept = new Department();
		
		IFactory factory = new SqlServerFactory();
		//IFactory factory = new AccessFactory();
		IUser iu = factory.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		
		IDepartment id = factory.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
	}
	
}
