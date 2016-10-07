package com.shermin.test;

public class TicketThread extends Thread{
	static int num=50;
	static Object object=new Object();
	public TicketThread(String name) {
		super(name);
	}
	public void run() {
		while (true) {
			//同步代码块钱
			//"lock"是最简单的锁对象
			synchronized ("lock") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+" 卖出第 "+num+" 张票");
					num--;
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}else{
					System.out.println("票卖完了.....");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		TicketThread t1=new TicketThread("1号窗口");
		TicketThread t2=new TicketThread("2号窗口");
		TicketThread t3=new TicketThread("3号窗口");
		t1.start();
		t2.start();
		t3.start();
	}

}
