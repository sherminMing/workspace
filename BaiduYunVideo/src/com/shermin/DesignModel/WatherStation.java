package com.shermin.DesignModel;

import java.util.ArrayList;
import java.util.Random;

class WatherStation{
	String[] weathers={"晴天","雨天","冰雹","雪天","阴天"};
	String weather;
	ArrayList<Emp> list=new ArrayList<Emp>();
	public void addListener(Emp p){
		list.add(p);
	}
	public void updateWeather(){
		Random random=new Random();
		int index=random.nextInt(weathers.length);
		weather=weathers[index];
		System.out.println("当前天气是:"+weather);
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