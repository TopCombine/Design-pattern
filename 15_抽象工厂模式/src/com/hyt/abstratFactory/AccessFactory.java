package com.hyt.abstratFactory;

public class AccessFactory implements IFactory {

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

}
