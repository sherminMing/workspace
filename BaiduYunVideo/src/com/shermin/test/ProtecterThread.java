package com.shermin.test;
class Mother extends Thread{
	public Mother(String name) {
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"做饭");
		Son s=new Son("我");
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
		System.out.println("出门");
	}
}
class Son extends Thread{
	public Son(String name) {
		super(name);
	}
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"倒垃圾");
		System.out.println(Thread.currentThread().getName()+"回家");
		System.out.println(Thread.currentThread().getName()+"进门");
	}
}
public class ProtecterThread extends Thread{
	public ProtecterThread(String name) {
		super(name);
	}
	@Override
	public void run() {
//		for(int i=1;i<=100;i++){
//			System.out.println("已下载"+i+"%.....");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//			if(i==100){
//				System.out.println("下载完毕，准备安装.......");
//			}
//		}
		
	
	}
	public static void main(String[] args) {
//		ProtecterThread pt=new ProtecterThread("后台线程");
//		pt.setDaemon(true);
//		System.out.println("守护线程吗？"+pt.isDaemon());
//        pt.start();
//        
//        for(int i=0;i<100;i++){
//        	System.out.println(Thread.currentThread().getName()+"  "+i);
//        }
		Mother mother=new Mother("妈妈");
		mother.start();
		//Son son=new Son();
		//son.start();
	}

}
