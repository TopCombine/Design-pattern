package com.hyt.ww;

/**
 * 具体命令类(烤鸡翅命令)
 * 
 * @author wangwen
 *
 * 2017-6-3上午11:06:11
 */
public class BakeChickenWing extends Command{

	public BakeChickenWing(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		Barbecuer.bakeChickenWing();
	}

}
