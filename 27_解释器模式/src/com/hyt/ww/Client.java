package com.hyt.ww;

/**
 * 客户端
 * 
 * @author wangwen
 *
 * 2017-6-3下午07:41:01
 */
public class Client {

	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		System.out.println("上海滩：");
		context.text = " 0 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2"+
		"A 0.5 G 1 C 0.5 E 0.5 D 3";
		Expression expression = null;
		while (context.text.length()>0) {
			String str = context.text.substring(0, 1);
			if (str.equals("O")) {
				expression = new Scale();
				break;
			}else{
				expression = new Note();
				break;
			}
		}
	}
	
}
