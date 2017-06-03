package com.hyt.ww;

public class Client {
	
	public static void main(String[] args) {
		//开店前的准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakeChickenWing(boy);
		Waiter girl = new Waiter();
		
		//开门营业
		girl.setOrder(bakeMuttonCommand);
		girl.notifyExcute();
		
		girl.setOrder(bakeMuttonCommand2);
		girl.notifyExcute();
		
		girl.setOrder(bakeChickenWingCommand);
		girl.notifyExcute();
	}
	
}
