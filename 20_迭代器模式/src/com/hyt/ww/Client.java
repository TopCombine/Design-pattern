package com.hyt.ww;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1下午09:41:41
 */
public class Client {

	public static void main(String[] args) {
		//公交车，即聚集对象
		ConcreteAggregate a = new ConcreteAggregate();
		//新上来的乘客，即对象数组
		List<Object> items = new ArrayList<Object>();
		items.add("大鸟");
		items.add("小菜");
		items.add("行李");
		items.add("老外");
		items.add("公交内部员工");
		items.add("小偷");
		
		a.setItems(items);
		
		//遍历
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while (!i.isDone()) {
			System.out.println(i.currentItem()+" 请买车票");
			i.next();//下一个乘客
		}
	}
	
}
