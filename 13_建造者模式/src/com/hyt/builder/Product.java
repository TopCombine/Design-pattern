package com.hyt.builder;

import java.util.ArrayList;

public class Product{
	ArrayList<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);	
	}
	
	public void show(){
		for (String str : parts) {
			System.out.println(str);
		}
	}
}
