package com.hyt.ww;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-3上午10:22:14
 */
public class Client {

	public static void main(String[] args) {
		HandsetBrand ab;
		ab = new HandsetBrandN();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		ab = new HandsetBrandM();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}
	
}
