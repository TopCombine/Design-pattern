package com.hyt.ww;

public class Client {
	public static void main(String[] args) {
		CommonManager com = new CommonManager("金利");
		Majordomo maj = new Majordomo("宗剑");
		GerneralManager ger = new GerneralManager("钟精励");
		
		com.setSuperior(maj);
		maj.setSuperior(ger);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		com.requestApplication(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		com.requestApplication(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		com.requestApplication(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		com.requestApplication(request4);
	}

	
	
}
