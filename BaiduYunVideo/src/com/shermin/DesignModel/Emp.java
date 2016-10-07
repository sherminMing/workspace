package com.shermin.DesignModel;

public class Emp {
	String name;
	public Emp(String name) {
		this.name=name;
	}
	public void notifyWeather(String weather) {
		if("晴天".endsWith(weather)){
			    System.out.println(this.name+" 高高兴去上班.......");
		}else if("雨天".endsWith(weather)){
				System.out.println(this.name+" 记得打伞啊......");}
		 else if("冰雹".endsWith(weather)){
				System.out.println(this.name+" 小心被砸到......");		}
		 else{
				System.out.println(this.name+" 哈哈........");
			}
	}	
	
	
}
