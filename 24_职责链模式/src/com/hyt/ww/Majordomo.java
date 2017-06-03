package com.hyt.ww;

/**
 * 总监
 * @author wangwen
 *
 */

public class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if (request.getRequestType().equals("请假") && request.getNumber()<=5) {
			System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
		}else{
			if (superior!=null) {
				superior.requestApplication(request);
			}
		}
	}
}
