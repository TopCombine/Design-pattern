package com.hyt.ww;

import java.util.Hashtable;


/**
 * 网站工厂类
 * 
 * @author wangwen
 *
 * 2017-6-3下午06:38:30
 */
public class WebSiteFactory {

	private Hashtable flyweights = new Hashtable();
	
	//获得网站分类
	public WebSite getWebSiteCategory(String key){
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	//获得网站分类总数
	public int getWebsiteCount(){
		return flyweights.size();
	}
}
