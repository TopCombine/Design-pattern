package com.hyt.ww;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类 
 * 
 * @author wangwen
 *
 * 2017-6-1下午09:36:04
 */
public class ConcreteAggregate extends Aggregate {
	
	List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}

	public Object getItems(int index) {
		return items.get(index);
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}
	
	

}
