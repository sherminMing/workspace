package com.shermin.DesignModel;

public class Emp {
	String name;
	public Emp(String name) {
		this.name=name;
	}
	public void notifyWeather(String weather) {
		if("����".endsWith(weather)){
			    System.out.println(this.name+" �߸���ȥ�ϰ�.......");
		}else if("����".endsWith(weather)){
				System.out.println(this.name+" �ǵô�ɡ��......");}
		 else if("����".endsWith(weather)){
				System.out.println(this.name+" С�ı��ҵ�......");		}
		 else{
				System.out.println(this.name+" ����........");
			}
	}	
	
	
}
