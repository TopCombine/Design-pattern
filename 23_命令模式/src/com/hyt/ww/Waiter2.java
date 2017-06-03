package com.hyt.ww;

import java.util.ArrayList;
import java.util.List;


/**
 * 服务员
 * 
 * @author wangwen
 *
 * 2017-6-3上午11:12:20
 */
public class Waiter2 {
	
	private List<Command> orders = new ArrayList<Command>();
	
	//设置订单
	public void setOrder(Command command){
		if (command instanceof BakeChickenWing) {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
		}else{
			orders.add(command);
			System.out.print("增加订单 ");
			command.excuteCommand();
			System.out.println("时间："+System.currentTimeMillis());
		}
	}
	
	//ȡ��
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("ȡ��");
	}
	
	//֪ͨȫ��ִ��
	public void notifyAllExcute(){
		for (Command cmd : orders) {
			cmd.excuteCommand();
		}
	}
	
}
