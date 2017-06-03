package com.hyt.Pattern;

/**
 * 观看NBA同事
 * 
 * @author wangwen
 *
 */
public class NBAObserver extends Observer{

	private String name;
	private Subject sub;
	
	public NBAObserver(String name, Subject sub) {
		super(name, sub);
		this.name = name;
		this.sub = sub;
	}

	@Override
	public void update() {
		System.out.println(sub.action()+" "+name+"关闭NBA直播，继续工作");
	}

}
