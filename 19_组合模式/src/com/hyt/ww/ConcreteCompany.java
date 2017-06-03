package com.hyt.ww;

import java.util.ArrayList;
import java.util.List;


/**
 * 具体公司类  实现接口  树枝节点
 * 
 * @author wangwen
 *
 * 2017-6-1下午07:56:39
 */
public class ConcreteCompany extends Company {
	
	List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + name);
		for (Company component : children) {
			component.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		for (Company component : children) {
			component.lineOfDuty();
		}
	}

}
