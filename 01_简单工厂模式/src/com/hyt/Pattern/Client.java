package com.hyt.Pattern;

import java.util.Scanner;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-5-26下午09:25:47
 */
public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入（+，-，*，/）四则运算之一");
		String opera = scan.next();
		System.out.println("请输入numberA");
		int numberA = scan.nextInt();
		System.out.println("请输入numberB");
		int numberB = scan.nextInt();
		
		Operation operation = SimpleFactory.createOperation(opera);
		System.out.println("结果为："+operation.getResult(numberA, numberB));
		
	}
	
}
