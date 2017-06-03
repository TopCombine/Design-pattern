package com.hyt.ww;

/**
 * 具体迭代器类
 * 
 * @author wangwen
 *
 * 2017-6-1下午09:33:37
 */
public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItems(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.count()) {
			ret = aggregate.getItems(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.count()?true:false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems(current);
	}

}
