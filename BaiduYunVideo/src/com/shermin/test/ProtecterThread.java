package com.shermin.test;
class Mother extends Thread{
	public Mother(String name) {
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"����");
		Son s=new Son("��");
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	
		System.out.println("����");
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������");
		System.out.println(Thread.currentThread().getName()+"�ؼ�");
		System.out.println(Thread.currentThread().getName()+"����");
	}
}
public class ProtecterThread extends Thread{
	public ProtecterThread(String name) {
		super(name);
	}
	@Override
	public void run() {
//		for(int i=1;i<=100;i++){
//			System.out.println("������"+i+"%.....");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO �Զ����ɵ� catch ��
//				e.printStackTrace();
//			}
//			if(i==100){
//				System.out.println("������ϣ�׼����װ.......");
//			}
//		}
		
	
	}
	public static void main(String[] args) {
//		ProtecterThread pt=new ProtecterThread("��̨�߳�");
//		pt.setDaemon(true);
//		System.out.println("�ػ��߳���"+pt.isDaemon());
//        pt.start();
//        
//        for(int i=0;i<100;i++){
//        	System.out.println(Thread.currentThread().getName()+"  "+i);
//        }
		Mother mother=new Mother("����");
		mother.start();
		//Son son=new Son();
		//son.start();
	}

}
