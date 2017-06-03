package com.hyt.abstratFactory;

public class SqlServerFactory implements IFactory {

	@Override
	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

}
