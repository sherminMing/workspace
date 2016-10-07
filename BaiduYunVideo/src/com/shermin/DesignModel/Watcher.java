package com.shermin.DesignModel;

import java.util.Random;

public class Watcher {

	public static void main(String[] args) throws InterruptedException {
		WatherStation watherStation=new WatherStation();
		watherStation.startWork();
		Emp e=new Emp("µÂ»ª");
		Emp e1=new Emp("ÐÇ³Û");
		watherStation.addListener(e);
		watherStation.addListener(e1);
		watherStation.startWork();
   	}

}
