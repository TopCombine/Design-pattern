package com.hyt.Pattern;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-1下午01:32:50
 */
public class Client {

	public static void main(String[] args) {
//		//前台
//		Secretary duoLaAMeng = new Secretary();
//		
//		//看股票的同事
//		Observer naruto = new StockObserver("naruto", duoLaAMeng);
//		Observer kakaxi = new StockObserver("kakaxi", duoLaAMeng);
//		
//		//前台记下了两位同事
//		duoLaAMeng.attach(naruto);
//		duoLaAMeng.attach(kakaxi);
//		
//		//发现老板回来
//		duoLaAMeng.action = "老板回来了";
//		duoLaAMeng.action();
//		
//		//通知两个同事
//		duoLaAMeng.Notify();
		
		//老板胡汉三
		Boss huhansan = new Boss();
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("naruto", huhansan);
		//看nba的同事
		NBAObserver tongshi2 = new NBAObserver("kakaxi",huhansan);
		
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);
		
		huhansan.detach(tongshi1);
		//老板回来
		huhansan.action = "我胡汉三回来了";
		//发出通知
		huhansan.Notify();
	}
	
}
