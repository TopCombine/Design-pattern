package com.hyt.ww;

import java.awt.List;
import java.util.ArrayList;

/**
 * 对象结构
 * 
 * @author wangwen
 *
 * 2017-6-3下午08:12:11
 */
public class ObjectStructure {

	ArrayList<Person> elements = new ArrayList();
	/**
	 * 增加
	 * @param element
	 */
	public void attach(Person element){
		elements.add(element);
	}
	/**
	 * 移除
	 * @param element
	 */
	public void detach(Person element){
		elements.remove(element);
	}
	/**
	 * 查看显示
	 * @param visitor
	 */
	public void display(Action visitor){
		for (Person e : elements) {
//			e.Accept(visitor);
		}
	}
}
