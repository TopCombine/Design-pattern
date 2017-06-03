package com.hyt.ww;


/**
 * 公司类  抽象类或接口
 * 
 * @author wangwen
 *
 * 2017-6-1下午07:50:10
 */
abstract class Company {

	protected String name;

	public Company(String name) {
		this.name = name;
	}
	                                          
	public abstract void add(Company c);      //增加
	public abstract void remove(Company c);   //移除
	public abstract void display(int depth);  //显示
	public abstract void lineOfDuty();        //履行职责
	
}
