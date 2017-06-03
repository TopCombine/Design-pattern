package com.hyt.Decoration;

/**
 * ConcreteComponent
 * 
 * @author wangwen
 *
 * 2017-5-31下午05:47:38
 */
public class Person {

	private String name;

	public Person(){
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println("装扮的"+name);
	}
}
