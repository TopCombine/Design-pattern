package com.hyt.ww;


/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1下午07:30:14
 */
public class Client {

	public static void main(String[] args) {
		//Originator初始状态,状态属性为"on"
		Originator o = new Originator();
		o.state = "On";
		o.show();
		
		//保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节
		Caretaker c = new Caretaker();
		c.memento = o.createMemento();
		
		//Originator改变了状态属性为"Off"
		o.state = "Off";
		o.show();
		
		//恢复原初始状态
		o.setMemento(c.memento);
		o.show();
		
	}
	
}
