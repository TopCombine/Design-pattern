package com.hyt.ww;

public class Client {
	public static void main(String[] args) {
		Work energencyWork = new Work();
		energencyWork.setHour(9);
		energencyWork.writeProgram();
		energencyWork.setHour(10);
		energencyWork.writeProgram();
		energencyWork.setHour(12);
		energencyWork.writeProgram();
		energencyWork.setHour(13);
		energencyWork.writeProgram();
		energencyWork.setHour(14);
		energencyWork.writeProgram();
		energencyWork.setHour(17);
		energencyWork.writeProgram();
		energencyWork.setHour(19);
		energencyWork.writeProgram();
		energencyWork.setHour(22);
		energencyWork.writeProgram();
	}
}
