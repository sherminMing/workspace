package com.shermin.DesignModel;

import java.util.ArrayList;
import java.util.Random;

class WatherStation{
	String[] weathers={"����","����","����","ѩ��","����"};
	String weather;
	ArrayList<Emp> list=new ArrayList<Emp>();
	public void addListener(Emp p){
		list.add(p);
	}
	public void updateWeather(){
		Random random=new Random();
		int index=random.nextInt(weathers.length);
		weather=weathers[index];
		System.out.println("��ǰ������:"+weather);
	}
	public void startWork() throws InterruptedException {
		final Random random=new Random();
	new Thread(){
		public void run() {
			while (true) {
				updateWeather();
				for (Emp  e : list) {
				e.notifyWeather(weather);	
				}
				try {
					Thread.sleep(random.nextInt(501)+1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}
	}.start();
}
}