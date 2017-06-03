package com.hyt.ww;

/**
 * 具体命令类(烤羊肉串命令)
 * 
 * @author wangwen
 *
 */
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		//具体命令，执行命令时，执行具体的行为
		Barbecuer.bakeMutton();
	}

	
	
}
