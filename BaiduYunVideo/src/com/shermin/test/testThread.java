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
				System.out.println(Thread.currentThread().getName()+"ȡ����1000Ԫ����ʣ"+(count-1000)+"Ԫ��");
				count=count-1000;
			}else{
				System.out.println("Ǯȡ����.....");
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
