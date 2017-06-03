package com.hyt.Pattern;

/**
 * 玩股票的同事 
 *
 * @author wangwen
 *
 */

public class StockObserver extends Observer{
	
	public String name;
	public Subject sub;
	
	public StockObserver(String name, Subject sub) {
		super(name, sub);
		this.name = name;
		this.sub = sub;
	}
	
	public void update(){
		System.out.println(sub.action()+" "+name+"关闭股票行情，继续工作");
	}
	
}
