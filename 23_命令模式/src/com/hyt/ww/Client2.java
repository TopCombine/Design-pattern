package com.hyt.ww;

public class Client2 {
	
	public static void main(String[] args) {
		//开店前的准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakeChickenWing(boy);
		Waiter2 girl = new Waiter2();
		
		//开门营业 顾客
		girl.setOrder(bakeMuttonCommand);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand);
		
		//点菜完毕，通知厨房
		girl.notifyAllExcute();
	}
	
}
