package com.shermin.DesignModel;

import java.util.Random;

public class Watcher {

	public static void main(String[] args) throws InterruptedException {
		WatherStation watherStation=new WatherStation();
		watherStation.startWork();
		Emp e=new Emp("�»�");
		Emp e1=new Emp("�ǳ�");
		watherStation.addListener(e);
		watherStation.addListener(e1);
		watherStation.startWork();
   	}

}
