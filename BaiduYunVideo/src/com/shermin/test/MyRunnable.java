package com.shermin.test;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		MyRunnable dMyRunnable=new MyRunnable();
		Thread thread=new Thread(dMyRunnable,"�ҵ��߳�");
		thread.start();
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
			}
	}

	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
			}
	}

}
