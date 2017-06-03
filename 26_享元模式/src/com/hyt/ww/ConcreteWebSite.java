package com.hyt.ww;

/**
 * 具体网站类
 * 
 * @author wangwen
 *
 * 2017-6-3下午06:37:00
 */
public class ConcreteWebSite extends WebSite {

	private String name = "";
	
	public ConcreteWebSite(String name){
		this.name = name;
	}
	
	@Override
	public void Use(User user) {
		System.out.println("网站分类:"+name+" 用户"+user.getName());
	}

}
