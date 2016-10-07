package com.shermin.test;

public class TicketThread extends Thread{
	static int num=50;
	static Object object=new Object();
	public TicketThread(String name) {
		super(name);
	}
	public void run() {
		while (true) {
			//ͬ�������Ǯ
			//"lock"����򵥵�������
			synchronized ("lock") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+" ������ "+num+" ��Ʊ");
					num--;
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}else{
					System.out.println("Ʊ������.....");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		TicketThread t1=new TicketThread("1�Ŵ���");
		TicketThread t2=new TicketThread("2�Ŵ���");
		TicketThread t3=new TicketThread("3�Ŵ���");
		t1.start();
		t2.start();
		t3.start();
	}

}
