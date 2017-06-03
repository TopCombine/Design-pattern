package com.hyt.abstratFactory;

/**
 * 用户类
 * 
 * @author wangwen
 *
 * 2017-6-1下午03:22:08
 */
public class User {

	private int id;
	private String name;
	
	public User() {
		super();
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
