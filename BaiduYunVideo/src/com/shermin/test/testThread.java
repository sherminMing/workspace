package com.shermin.test;

public class testThread extends Thread{
	static int count=10000;
	
	public testThread(String name) {
		super(name);
	}
	public void run() {
	while (true) {
		synchronized("lock"){
			if(count>0){
				System.out.println(Thread.currentThread().getName()+"取走了1000元，还剩"+(count-1000)+"元。");
				count=count-1000;
			}else{
				System.out.println("钱取完了.....");
				break;
			}
		}
	}	
	}
	public static void main(String[] args) {
		testThread husband=new testThread("hunband");
		testThread wife=new testThread("wife");
		husband.start();
		wife.start();
	}

}
