package com.hyt.Pattern;


/**
 * 简单工厂模式
 * @author wangwen
 *
 */
public class SimpleFactory {
	
	public static Operation createOperation(String operationMethod){
		Operation operation = null;
		if (operationMethod.equals("+")) {
			operation = new Add();
		}else if (operationMethod.equals("-")) {
			operation = new Sub();
		}
		return operation;
	}

}
