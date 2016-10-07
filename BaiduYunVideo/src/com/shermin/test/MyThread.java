package com.shermin.test;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread=new MyThread("琳达");
		myThread.setPriority(10);
		//System.out.println("线程名:"+myThread.getName());
		
		//myThread.sleep(1000);
		myThread.start();
		for(int i=0;i<100;i++){
		System.out.println("currentThread:"+Thread.currentThread().getName()+i);
		}
	}
	public void run() {
		//System.out.println("this:"+this);
		//System.out.println("currentThread:"+Thread.currentThread());
		for(int i=0;i<100;i++){
			System.out.println(this.getName()+i);
		}
		//Thread.sleep(1000);
	}
}
