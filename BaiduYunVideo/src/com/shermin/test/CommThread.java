package com.shermin.test;
/*
 * ����������������.......
 */
class Product{
	String name;
	double price;
	boolean flag=false;//��Ʒ�Ƿ�������ϵı�־
}
class Producter extends Thread{
	Product p;
	public Producter(Product p){
		this.p=p;
	}
	public Producter(String name){
		super(name);
	}
	public void run() {
		int i=0;
		while(true){
			synchronized (p) {
				
				if(p.flag==false){
					if(i%2==0){
						p.name="ƻ��";
						p.price=6.5;
					}else{
					p.name="�㽶";
					p.price=2;
					}
					System.out.println("������������:"+p.name+"�۸�"+p.price);
					p.flag=true;
					i++;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				
				
				
				
			}
		}
	}
}
class Customer extends Thread{
	Product p;
	public Customer(Product p){
		this.p=p;
	}
	public Customer(String name) {
		super(name);
	}
	public void run() {
	while(true){
   synchronized (p) {
	if(p.flag==true){
	   System.out.println("������������:"+p.name+"�۸�"+p.price);
	   p.flag=false;
	   p.notify();
	}else {
		//��Ʒû����
		try {
			p.wait();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
   }
	}
	}
}
public class CommThread {

	public static void main(String[] args) {
	Product p=new Product();
	Producter producter=new Producter(p);
	Customer customer=new Customer(p);
	producter.start();
	customer.start();
	}

}
